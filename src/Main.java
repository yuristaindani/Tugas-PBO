import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<String, Restaurant> dataRestaurant = new HashMap<>();

    public static void main(String[] args) {

// Menginisialisasikan restoran beserta menunya
        Restaurant restoran1 = new Restaurant("DELIRESTO1", "ITALIANO RESTAURANT", "Marylebone", "020 123 4567");
        restoran1.tambahMenuResto(new Menu("Pizza Margherita", 120000));
        restoran1.tambahMenuResto(new Menu("Lasagna", 150000));
        restoran1.tambahMenuResto(new Menu("Spaghetti Carbonara", 80000));
        restoran1.tambahMenuResto(new Menu("Tiramisu", 60000));
        restoran1.tambahMenuResto(new Menu("Espresso", 40000));
        restoran1.tambahMenuResto(new Menu("Cappuccino", 50000));
        restoran1.tambahMenuResto(new Menu("Ice Latte", 60000));
        restoran1.tambahMenuResto(new Menu("Americano", 40000));

        Restaurant restoran2 = new Restaurant("DELIRESTO2", "RASA LOKAL RESTAURANT", "Westminster", "020 123 5789");
        restoran2.tambahMenuResto(new Menu("Rendang Sapi", 80000));
        restoran2.tambahMenuResto(new Menu("Sate Kambing", 60000));
        restoran2.tambahMenuResto(new Menu("Ayam Gulai", 40000));
        restoran2.tambahMenuResto(new Menu("Bakso Ayam", 30000));
        restoran2.tambahMenuResto(new Menu("Es Tea", 10000));
        restoran2.tambahMenuResto(new Menu("Es Kelapa Muda", 20000));
        restoran2.tambahMenuResto(new Menu("Es Jeruk", 15000));
        restoran2.tambahMenuResto(new Menu("Es Campur", 20000));

        Restaurant restoran3 = new Restaurant("DELIRESTO3", "JAPANESE RESTAURANT", "London", "020 123 0314");
        restoran3.tambahMenuResto(new Menu("Sushi", 50000));
        restoran3.tambahMenuResto(new Menu("Ramen", 90000));
        restoran3.tambahMenuResto(new Menu("Udon", 70000));
        restoran3.tambahMenuResto(new Menu("Tempura", 30000));
        restoran3.tambahMenuResto(new Menu("Matcha Latte", 50000));
        restoran3.tambahMenuResto(new Menu("Sake", 60000));
        restoran3.tambahMenuResto(new Menu("Ocha", 20000));
        restoran3.tambahMenuResto(new Menu("Melon Soda", 40000));

        Restaurant restoran4 = new Restaurant("DELIRESTO4", "CHINESE RESTAURANT", "Soho", "020 123 1101");
        restoran4.tambahMenuResto(new Menu("Bebek Panggang", 80000));
        restoran4.tambahMenuResto(new Menu("Sapi Lada Hitam", 90000));
        restoran4.tambahMenuResto(new Menu("Ayam Kung Pao", 60000));
        restoran4.tambahMenuResto(new Menu("Lumpia Udang", 30000));
        restoran4.tambahMenuResto(new Menu("Oolong Tea", 20000));
        restoran4.tambahMenuResto(new Menu("Jasmine Tea", 20000));
        restoran4.tambahMenuResto(new Menu("Bubble Milk Tea", 30000));
        restoran4.tambahMenuResto(new Menu("Almond Milk", 25000));

// menambahkan restaurant ke dalam HashMap
        dataRestaurant.put("DELIRESTO1", restoran1);
        dataRestaurant.put("DELIRESTO2", restoran2);
        dataRestaurant.put("DELIRESTO3", restoran3);
        dataRestaurant.put("DELIRESTO4", restoran4);

        Scanner input = new Scanner(System.in);
        int pilih = 0;
        boolean isAdmin = false;

        while (pilih != 3) {
            // tampilkan menu utama
            Scanner person = new Scanner(System.in);
            Customer customer = new Customer();
            //int login;

            System.out.println("=====================================================================");
            System.out.println("|                            HELLO DELIGUYS                         |");
            System.out.println("|                         WELCOME TO DELIFOOD                       |");
            System.out.println("=====================================================================");
            System.out.println("|                             WELCOME USER                          |");
            System.out.println("|                         CHOOSE YOUR CATEGORY                      |");
            System.out.println("|                                                                   |");
            System.out.println("| [1] Admin                                                         |");
            System.out.println("| [2] Customer                                                      |");
            System.out.println("| [3] Exit                                                          |");
            System.out.println("=====================================================================");
            System.out.print("Masukkan pilihan Anda (1 - 3): ");
            pilih = person.nextInt();

            switch (pilih) {
                case 1:
                    Admin.adminLogin();
                    hapusLayar.CLS();
                    break;
                case 2:
                    Customer.custLogin();
                    hapusLayar.CLS();
                    break;
                case 3:
                    Tampilan.tampilanThankyou();
                    System.exit(0);
                    break;
                default:
                    Tampilan.inputSalah1();
                    break;
            }
        }
    }
}



