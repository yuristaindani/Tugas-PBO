import java.util.Scanner;

public class Restaurant {
    public static void displayAdmin(){
        Scanner adminDisplay = new Scanner(System.in);
        int pilih;

        System.out.println("=========================================");
        System.out.println("\t\t1. List Restaurant");
        System.out.println("\t\t2. Add Restaurant");
        System.out.println("\t\t3. Delete Restaurant");
        System.out.println("\t\t4. Back");
        System.out.println("=========================================");
        System.out.println("I choose: ");
        pilih = adminDisplay.nextInt();

    }
}
