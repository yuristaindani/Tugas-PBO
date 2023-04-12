import java.util.Scanner;

public class loginAdmin {
    public static void admin(){
        Scanner admin = new Scanner(System.in);

        String username = "adminyuris";
        String password = "yuris123";

        System.out.println("Insert your username adn password");
        System.out.println("\t\t\t\t\tUsername: ");
        String adminUsername = admin.nextLine();
        System.out.println("\t\t\t\t\tPassword: ");
        String adminPassword = admin.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)){
            System.out.println("Login Successful");
        } else{
            System.out.println("Login unsuccessfull. Try again!");
        }
    }
}

