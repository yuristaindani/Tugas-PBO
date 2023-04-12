import java.util.Scanner;

public class Restaurant {
    public static void displayAdmin() {
        Scanner adminDisplay = new Scanner(System.in);
        int pilih;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t1. List Restaurant");
        System.out.println("\t\t\t\t2. Add Restaurant");
        System.out.println("\t\t\t\t3. Delete Restaurant");
        System.out.println("\t\t\t\t4. Back");
        System.out.println("\t\t=========================================");
        System.out.println("I choose: ");
        pilih = adminDisplay.nextInt();

        switch (pilih) {
            case 1:
                restaurantList();
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
                displayAdmin();

        }

    }
    public static void restaurantList(){
        Scanner list = new Scanner(System.in);
        int pilihList;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t1. Italiano Resto");
        System.out.println("\t\t\t\t2. Rasa Lokal Resto");
        System.out.println("\t\t\t\t3. Japanese Resto");
        System.out.println("\t\t\t\t4. Chinese Resto");
        System.out.println("\t\t\t\t5. Back");
        System.out.println("\t\t=========================================");
        System.out.println("\t\tI choose: ");
        pilihList = list.nextInt();

        switch (pilihList){
            case 1:
                //call data resto 1
                break;
            case 2:
                //call data resto 2
                break;
            case 3:
                //call data resto 3
                break;
            case 4:
                //call data retso 4
                break;
            case 5:
                displayAdmin();
                break;
            default:
                System.out.println("Your input is wrong! Please try again (number 1-5)");
                restaurantList();
        }
    }
}