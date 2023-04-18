import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Customer {

    private static HashMap<String, String> customers = new HashMap<>();  //membuat objek HashMap untuk menyimpan data user

    public static void custLogin(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("======================================================================");
            System.out.println("|                        CUSTOMER LOGIN/SIGN UP                      |");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("|    [1] Login                                                       |");
            System.out.println("|    [2] Sign Up                                                     |");
            System.out.println("|    [3] Back                                                        |");
            System.out.println("======================================================================");
            System.out.print("I CHOOSE (1- 3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  //menghapus newline yang tersisa dari input sebelumnya

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    signup(scanner);
                    break;
                case 3:
                    running = false;
                    Main.main(new String[] {});
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }

    private static void login(Scanner scanner) {
        Tampilan.tampilUserLogin();
        System.out.print("USERNAME: ");
        String username = scanner.nextLine();
        System.out.print("PASSWORD: ");
        String password = scanner.nextLine();

        //memeriksa apakah username dan password sesuai
        if (customers.containsKey(username) && customers.get(username).equals(password)) {
            Tampilan.loginBerhasil();
            custHomePage();
        } else {
            Tampilan.tampilLogGagal();
        }
    }

    private static void signup(Scanner scanner) {
        System.out.print("USERNAME: ");
        //memeriksa apakah username sudah terdaftar
        String username = scanner.nextLine();
        if (customers.containsKey(username)) {
            Tampilan.tampilSignUpAda();
            return;
        }
        System.out.print("PASSWORD: ");
        String password = scanner.nextLine();
        //menambahkan data user baru ke dalam HashMap
        customers.put(username, password);
        Tampilan.signUpBerhasil();
        custLogin();
    }




    static void custHomePage() {
        Scanner input = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();
        int memilih = 0;

        while (memilih != 3) {
            // tampilkan menu customer
            System.out.println("======================================================================");
            System.out.println("|                        CUSTOMER HOME PAGE                          |");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("|    [1] Order                                                       |");
            System.out.println("|    [2] View Orders                                                 |");
            System.out.println("|    [3] Back                                                        |");
            System.out.println("======================================================================");
            System.out.print("I CHOOSE (1-3): ");
            memilih = input.nextInt();
            input.nextLine(); // consume newline character

            switch (memilih) {
                case 1:
                    System.out.println("======================================================================");
                    System.out.println("                       DELIFOOD'S RESTAURANT                          ");
                    System.out.println("----------------------------------------------------------------------");
                    int restoNumber = 1;
                    for (String restaurantId : Main.dataRestaurant.keySet()) {
                        Restaurant restaurant = Main.dataRestaurant.get(restaurantId);
                        System.out.printf("%-20s %-30s %-30s%n", restaurantId, restaurant.getnamaResto(), restaurant.getalamatResto());
                        restoNumber++;
                    }

                    System.out.println("======================================================================");
                    System.out.print("Enter id restaurant: ");
                    String restaurantName = input.nextLine();
                    if (!Main.dataRestaurant.containsKey(restaurantName)) {
                        System.out.println("Restaurant not found");
                        break;
                    }

                    Restaurant restaurant = Main.dataRestaurant.get(restaurantName);
                    Order newOrder = new Order(restaurant);

                    String menuInput = "";
                    while (!menuInput.equals("n")) {
                        System.out.println("======================================================================");
                        System.out.println("\t\t\t\t\t\t" + restaurant.getnamaResto());
                        System.out.println("----------------------------------------------------------------------");
                        int menuNumber = 1;
                        for (Menu menu : restaurant.getMenu()) {
                            System.out.printf("%s %-30s %-30s%n", menuNumber, menu.getNamaMenu(), menu.getHargaMenu());
                            menuNumber++;
                        }
                        System.out.println("======================================================================");
                        System.out.print("Enter menu number: ");
                        int menuIndex = input.nextInt();
                        System.out.print("Enter quantity: ");
                        int quantity = input.nextInt();
                        input.nextLine();

                        newOrder.addMenu(restaurant.getMenu().get(menuIndex - 1), quantity);

                        Tampilan.moreMenu();
                        System.out.print("I CHOOSE (y/n): ");
                        menuInput = input.nextLine();
                    }

                    System.out.print("Enter distance (in km): ");
                    int distance = input.nextInt();

                    newOrder.setDistance(distance);
                    orders.add(newOrder);
                    Tampilan.orederBerhasil();
                    break;
                case 2:
                    Tampilan.tampilanOrder();
                    for (int i = 0; i < orders.size(); i++) {
                        Order order = orders.get(i);
                        System.out.println((i + 1) + ". " + order.getRestaurant().getnamaResto());
                        System.out.println("Menu:");
                        for (Menu menu : order.getMenu().keySet()) {
                            System.out.printf("%-20s  x%-40s\n" , menu.getNamaMenu(), order.getMenu().get(menu));
                        }
                        System.out.println("Distance (Ongkir: 5000(in km)): " + order.getDistance() + " km");
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("Total Price: " + order.getTotalPrice());
                        System.out.println("======================================================================");
                    }
                    break;
                case 3:custLogin();
                    break;
                default:
                    Tampilan.inputSalah2();
                    custHomePage();
                    break;
            }

        }
    }
}
