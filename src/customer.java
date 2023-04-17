import java.util.HashMap;
import java.util.Scanner;

public class loginUser {

    private static HashMap<String, String> users = new HashMap<>();  //membuat objek HashMap untuk menyimpan data user

    public static void cust(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Silakan pilih menu:");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Keluar");

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
                    Main balik = new Main();
                    balik.tampilan();
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }

    private static void login(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {  //memeriksa apakah username dan password sesuai
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal, silakan coba lagi.");
        }
    }

    private static void signup(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {  //memeriksa apakah username sudah terdaftar
            System.out.println("Username sudah terdaftar, silakan coba lagi.");
            return;
        }
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        users.put(username, password);  //menambahkan data user baru ke dalam HashMap
        System.out.println("Sign up berhasil! Silakan login.");
    }
}