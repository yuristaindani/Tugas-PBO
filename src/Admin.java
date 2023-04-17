import java.util.Scanner;


public class Admin {


    public static void adminLogin() {
        Scanner admin = new Scanner(System.in);

        String username = "adminyuris";
        String password = "yuris123";

        System.out.println("Insert your username and password");
        System.out.print("Username: ");
        String adminUsername = admin.nextLine();
        System.out.print("Password: ");
        String adminPassword = admin.nextLine();

        hapusLayar bersih = new hapusLayar();
        bersih.layarClear();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            Tampilan.loginBerhasil();
            displayAdmin();
        } else {
            System.out.println("Login unsuccessfull. Try again!");
        }
    }

    //tampilan admin setelah login
    public static void displayAdmin() {
        Scanner keyboard = new Scanner(System.in);
        int pilih = 0;

        while (pilih != 4) {
            System.out.println("======================================================================");
            System.out.println("===                  Silakan pilih opsi yang diinginkan:           ===");
            System.out.println("===                                                                ===");
            System.out.println("===  [1] Lihat restoran                                            ===");
            System.out.println("===  [2] Tambah restoran                                           ===");
            System.out.println("===  [3] Hapus restoran                                            ===");
            System.out.println("===  [4] Kembali ke menu utama                                     ===");
            System.out.println("======================================================================");
            System.out.print("I choose (1- 4): ");
            pilih = keyboard.nextInt();

            hapusLayar clean = new hapusLayar();
            clean.layarClear();

            switch (pilih) {
                case 1:
                    daftarResto();
                    break;
                case 2:
                    addRestaurant();
                    break;
                case 3:
                    deleteResto();
                    break;
                case 4:
//                main
                default:
                    System.out.println("Your input is wrong! Please try again (Number 1-4)");
                    hapusLayar.layarClear();

            }
        }
    }

    public static void daftarResto(){
        for (String restaurantName : Main.dataRestaurant.keySet()) {
            Restaurant restaurant = Main.dataRestaurant.get(restaurantName);
            System.out.println("====================================================================");
            System.out.println("\t\t\t\t\t\t" + restaurant.getnamaResto());
            System.out.println("\tID RESTO        : " + restaurant.getidResto());
            System.out.println("\tAddress         : " + restaurant.getalamatResto());
            System.out.println("\tContact Person  : " + restaurant.getkontakResto());
            System.out.println("------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\tRESTAURANT MENU");
            for (Menu menu : Main.dataRestaurant.get(restaurantName).getMenu()) {
                System.out.printf("\t %-20s \t\t\tRp. %-20s\n", menu.getNamaMenu(), menu.getHargaMenu());
            }
            System.out.println("====================================================================");
        }
    }
    public static void addRestaurant(){
        Scanner masukkan = new Scanner(System.in);

        System.out.print("Enter id restaurant: ");
        String idResto = masukkan.nextLine();
        System.out.print("Enter restaurant name: ");
        String namaResto = masukkan.nextLine();
        System.out.print("Enter restaurant address: ");
        String alamatResto = masukkan.nextLine();
        System.out.print("Enter restaurant contact: ");
        String kontakResto = masukkan.nextLine();
        Restaurant newRestaurant = new Restaurant(idResto, namaResto, alamatResto, kontakResto);
        String inputUlang = "";
        while (!inputUlang.equals("done")) {
            System.out.print("Enter menu (ex input format: menuName=menuPrice), input \"done\" to finish: ");
            inputUlang = masukkan.nextLine();
            if (!inputUlang.equals("done")) {
                String[] menuData = inputUlang.split("=");
                newRestaurant.addMenu(new Menu(menuData[0], Integer.parseInt(menuData[1])));
            }
        }
        Main.dataRestaurant.put(idResto, newRestaurant);
        System.out.println("\t\t\tRestaurant added successfully\n\n");
    }
    public static void deleteResto (){
        Scanner input = new Scanner(System.in);
        daftarResto();

        System.out.print("Enter id restaurant: ");
        String idResto = input.nextLine();
        if (Main.dataRestaurant.containsKey(idResto)) {
            Main.dataRestaurant.remove(idResto);
            System.out.println("Restaurant removed successfully");
        } else {
            System.out.println("Restaurant not found");
        }
    }
}
