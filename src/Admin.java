import java.util.Scanner;
import java.util.HashMap;

public class Admin {


    public static void adminLogin() {
        Scanner admin = new Scanner(System.in);

        String username = "adminyuris";
        String password = "yuris123";

        Tampilan.tampilAdminLogin();
        System.out.print("USERNAME: ");
        String adminUsername = admin.nextLine();
        System.out.print("PASSWORD: ");
        String adminPassword = admin.nextLine();

        hapusLayar.CLS();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            Tampilan.loginBerhasil();
            displayAdmin();
        } else {
            Tampilan.tampilLogGagal();
        }
    }

    //tampilan admin setelah login
    public static void displayAdmin() {
        Scanner keyboard = new Scanner(System.in);
        int pilih = 0;

        while (pilih != 4) {
            System.out.println("======================================================================");
            System.out.println("|                           ADMIN HOME PAGE                          |");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("|    [1] List restaurant                                             |");
            System.out.println("|    [2] Add new restaurant                                          |");
            System.out.println("|    [3] Delete restaurant                                           |");
            System.out.println("|    [4] Back to login                                               |");
            System.out.println("======================================================================");
            System.out.print("I choose (1- 4): ");
            pilih = keyboard.nextInt();

            hapusLayar.CLS();

            switch (pilih) {
                case 1:
                    daftarResto();
                    hapusLayar.CLS();
                    break;
                case 2:
                    addRestaurant();
                    hapusLayar.CLS();
                    break;
                case 3:
                    deleteResto();
                    hapusLayar.CLS();
                    break;
                case 4:
                    Main.main(new String[] {});
                    hapusLayar.CLS();
                break;
                default:
                    Tampilan.inputSalah();
                    hapusLayar.CLS();

            }
        }
    }

    public static void daftarResto(){
        for (String restaurantName : Main.dataRestaurant.keySet()) {
            Restaurant restaurant = Main.dataRestaurant.get(restaurantName);
            System.out.println("======================================================================");
            System.out.println("\t\t\t\t\t\t" + restaurant.getnamaResto());
            System.out.println("\tID RESTO        : " + restaurant.getidResto());
            System.out.println("\tAddress         : " + restaurant.getalamatResto());
            System.out.println("\tContact Person  : " + restaurant.getkontakResto());
            System.out.println("--------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\tRESTAURANT MENU");
            for (Menu menu : Main.dataRestaurant.get(restaurantName).getMenu()) {
                System.out.printf("\t %-20s \t\t\tRp. %-20s\n", menu.getNamaMenu(), menu.getHargaMenu());
            }
            System.out.println("======================================================================");
        }
    }
    public static void addRestaurant(){
        Scanner masukkan = new Scanner(System.in);

        Tampilan.menuAddTampil();
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
        Tampilan.tampilNambahMenu();
        while (!inputUlang.equals("DONE")) {
            System.out.print("MENU: ");
            inputUlang = masukkan.nextLine();
            if (!inputUlang.equals("DONE")) {
                String[] menuData = inputUlang.split("=");
                newRestaurant.addMenu(new Menu(menuData[0], Integer.parseInt(menuData[1])));
            }
        }
        Main.dataRestaurant.put(idResto, newRestaurant);
        Tampilan.addBerhasil();
        hapusLayar.CLS();
    }
    public static void deleteResto (){
        Scanner input = new Scanner(System.in);
        daftarResto();

        Tampilan.tampilanDelete();
        System.out.print("Id restaurant: ");
        String idResto = input.nextLine();
        if (Main.dataRestaurant.containsKey(idResto)) {
            Main.dataRestaurant.remove(idResto);
            Tampilan.tampilanDeleteBerhasil();
        } else {
            Tampilan.tampilanDeleteGagal();
        }
    }
}
