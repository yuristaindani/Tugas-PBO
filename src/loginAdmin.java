import java.util.Scanner;

public class loginAdmin {
    public static void admin() {
        Scanner admin = new Scanner(System.in);

        String username = "adminyuris";
        String password = "yuris123";

        System.out.println("Insert your username adn password");
        System.out.print("\t\t\t\t\tUsername: ");
        String adminUsername = admin.nextLine();
        System.out.print("\t\t\t\t\tPassword: ");
        String adminPassword = admin.nextLine();

        hapusLayar bersih = new hapusLayar();
        bersih.layarClear();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login unsuccessfull. Try again!");
            Main display = new Main();
            display.tampilan();
        }
    }

    //tampilan admin setelah login
    public static void displayAdmin() {
        Scanner adminDisplay = new Scanner(System.in);
        int pilih;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t1. List Restaurant");
        System.out.println("\t\t\t\t2. Add Restaurant");
        System.out.println("\t\t\t\t3. Delete Restaurant");
        System.out.println("\t\t\t\t4. Back");
        System.out.println("\t\t=========================================");
        System.out.print("I choose: ");
        pilih = adminDisplay.nextInt();

        hapusLayar clean = new hapusLayar();
        clean.layarClear();

        switch (pilih) {
            case 1:
                Restaurant listRestoadmin = new Restaurant();
                listRestoadmin.restaurantList();
                break;
            case 2:
                //call add restaurant
                break;
            case 3:
                //call delete restaurant
                break;
            case 4:
                Main backLogin = new Main();
                backLogin.tampilan();
            default:
                System.out.println("Your input is wrong! Please try again (Number 1-4)");
                hapusLayar clear = new hapusLayar();

        }
    }
}

