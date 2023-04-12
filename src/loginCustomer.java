import java.util.Scanner;

public class loginCustomer {
    public static void cust() {
        Scanner input = new Scanner(System.in);
        String username, password, confirmPassword;

        // Sign up
        System.out.println("Sign up:");
        System.out.print("Enter your username: ");
        username = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();
        System.out.print("Confirm your password: ");
        confirmPassword = input.nextLine();

        while (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match. Please try again.");
            System.out.print("Enter your password: ");
            password = input.nextLine();
            System.out.print("Confirm your password: ");
            confirmPassword = input.nextLine();
        }

        System.out.println("Sign up successful!");

        // Login
        System.out.println("\nLogin:");
        System.out.print("Enter your username: ");
        String inputUsername = input.nextLine();
        System.out.print("Enter your password: ");
        String inputPassword = input.nextLine();

        while (!username.equals(inputUsername) || !password.equals(inputPassword)) {
            System.out.println("Invalid username or password. Please try again.");
            System.out.print("Enter your username: ");
            inputUsername = input.nextLine();
            System.out.print("Enter your password: ");
            inputPassword = input.nextLine();
        }

        System.out.println("Login successful!");
        next();
    }


    // Lanjut ke menu selanjutnya jika login berhasil
    // ... kode untuk menu selanjutnya ...

    public static void next() {
        Scanner choose = new Scanner(System.in);
        int pilihan;
        System.out.println("1. Buat Pesanan");
        System.out.println("2. Back");
        System.out.println("I choose: ");
        pilihan = choose.nextInt();

        switch (pilihan) {
            case 1:
                //call restaurant
                break;
            case 2:
                Main kembali = new Main();
                kembali.tampilan();
                break;
            default:
                System.out.println("Your input is wrong! Please try again (Number 1/2)");
                next();


        }
    }
}
