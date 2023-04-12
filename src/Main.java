import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\t\t\t\t\t=========================================\t\t\t\t\t");
        System.out.println("\t\t\t\t\t====          Hello Deliguys!        ====\t\t\t\t\t");
        System.out.println("\t\t\t\t\t====        Welcome to Delifood!     ====\t\t\t\t\t");
        System.out.println("\t\t\t\t\t==== Order your food here and enjoy! ====\t\t\t\t\t");
        System.out.println("\t\t\t\t\t====                                 ====\t\t\t\t\t");
        System.out.println("\t\t\t\t\t=========================================\t\t\t\t\t");

        tampilan();
    }

    public static void tampilan() {
        Scanner person = new Scanner(System.in);
        loginAdmin admin = new loginAdmin();
        loginCustomer customer = new loginCustomer();
        int login;

            System.out.println("\t\t\t\t\t=========================================\t\t\t\t\t");
            System.out.println("\t\t\t\t\t====            Who are you?         ====\t\t\t\t\t");
            System.out.println("\t\t\t\t\t====              1. Admin           ====\t\t\t\t\t");
            System.out.println("\t\t\t\t\t====             2. Customer         ====\t\t\t\t\t");
            System.out.println("\t\t\t\t\t=========================================\t\t\t\t\t");

            System.out.print("I am login as: ");
            login = person.nextInt();

            switch (login) {
                case 1:
                    admin.admin();
                    Restaurant tampil = new Restaurant();
                    tampil.displayAdmin();
                    break;
                case 2:
                    customer.cust();
                    break;
                default:
                    System.out.println("Your input is wrong! Please try again (Number 1/2)");

            }
    }
}



