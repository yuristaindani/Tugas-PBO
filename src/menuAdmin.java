import java.util.Scanner;

public class menuAdmin {
    //tampilan setelah admin memilih untuk melihat menu
    public static void menuResto1(){
        Scanner menuR1 = new Scanner(System.in);
        int menu;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tItaliano Resto");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1. Food");
        System.out.println("\t\t\t\t\t\t2. Drink");
        System.out.println("\t\t\t\t\t\t3. Back");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        menu = menuR1.nextInt();

        hapusLayar clear = new hapusLayar();
        clear.layarClear();

        switch (menu){
            case 1:
                italifood();
                break;
            case 2:
                //call drink italiano
                break;
            case 3:
                Restaurant menuItalia = new Restaurant();
                menuItalia.italiano();
            default:
                System.out.println("Your input is wrong. Please try again! (Number 1-3)");
                menuResto1();
        }
    }
    public static void menuResto2(){
        Scanner menuR2 = new Scanner(System.in);
        int menu2;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tRasa Lokal Resto");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1. Food");
        System.out.println("\t\t\t\t\t\t2. Drink");
        System.out.println("\t\t\t\t\t\t3. Back");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        menu2 = menuR2.nextInt();

        hapusLayar layarclear = new hapusLayar();
        layarclear.layarClear();

        switch (menu2){
            case 1:
                lokalfood();
                break;
            case 2:
                //call drink rasa lokal
                break;
            case 3:
                Restaurant menuRasa = new Restaurant();
                menuRasa.rasaLokal();
            default:
                System.out.println("Your input is wrong. Please try again! (Number 1-3)");
                menuResto1();
        }
    }
    public static void menuResto3(){
        Scanner menuR3 = new Scanner(System.in);
        int menu3;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tJapanese Resto");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1. Food");
        System.out.println("\t\t\t\t\t\t2. Drink");
        System.out.println("\t\t\t\t\t\t3. Back");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        menu3 = menuR3.nextInt();

        hapusLayar layarBersih = new hapusLayar();
        layarBersih.layarClear();

        switch (menu3){
            case 1:
                japanfood();
                break;
            case 2:
                //call drink japan
                break;
            case 3:
                Restaurant menuJapan = new Restaurant();
                menuJapan.japanese();
            default:
                System.out.println("Your input is wrong. Please try again! (Number 1-3)");
                menuResto3();
        }
    }
    public static void menuResto4(){
        Scanner menuR4 = new Scanner(System.in);
        int menu4;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tChinese Resto");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1. Food");
        System.out.println("\t\t\t\t\t\t2. Drink");
        System.out.println("\t\t\t\t\t\t3. Back");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        menu4 = menuR4.nextInt();

        hapusLayar layarClear = new hapusLayar();
        layarClear.layarClear();

        switch (menu4){
            case 1:
                chinesefood();
                break;
            case 2:
                //call drink chinese
                break;
            case 3:
                Restaurant menuChinese = new Restaurant();
                menuChinese.chinese();
            default:
                System.out.println("Your input is wrong. Please try again! (Number 1-3)");
                menuResto4();
        }
    }
    //membuat menu makanan dari semua resto
    public static void italifood(){
        Scanner menu1food = new Scanner(System.in);
        int itali;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tItalian Foods");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t* Pizza Margherita    \t\tRp 120.000,00");
        System.out.println("\t\t* Lasagna             \t\tRp 150.000,00");
        System.out.println("\t\t* Spaghetti Carbonara \t\tRp 80.000,00");
        System.out.println("\t\t* Tiramisu            \t\tRp 60.000,00");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1. Back");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        itali = menu1food.nextInt();

        hapusLayar bersihkanLayar = new hapusLayar();
        bersihkanLayar.layarClear();

        if (itali == 1) {
            menuResto1();
        } else {
            System.out.println("Your input is wrong. Please try again!");
            italifood();
        }
    }
    public static void lokalfood(){
        Scanner menu2food = new Scanner(System.in);
        int rasalokal;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tRasa Lokal Foods");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t* Rendang Sapi    \t\tRp 80.000,00");
        System.out.println("\t\t* Sate Kambing    \t\tRp 60.000,00");
        System.out.println("\t\t* Ayam Gulai      \t\tRp 40.000,00");
        System.out.println("\t\t* Bakso Ayam      \t\tRp 30.000,00");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1. Back");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        rasalokal = menu2food.nextInt();

        hapusLayar bersihkanLayar = new hapusLayar();
        bersihkanLayar.layarClear();

        if (rasalokal == 1) {
            menuResto2();
        } else {
            System.out.println("Your input is wrong. Please try again!");
            lokalfood();
        }
    }
    public static void japanfood(){
        Scanner menu3food = new Scanner(System.in);
        int japan;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tJapanese Foods");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t* Sushi      \t\tRp 50.000,00");
        System.out.println("\t\t* Ramen      \t\tRp 90.000,00");
        System.out.println("\t\t* Udon       \t\tRp 70.000,00");
        System.out.println("\t\t* Tempura    \t\tRp 30.000,00");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1. Back");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        japan = menu3food.nextInt();

        hapusLayar bersihkanLayar = new hapusLayar();
        bersihkanLayar.layarClear();

        if (japan == 1) {
            menuResto3();
        } else {
            System.out.println("Your input is wrong. Please try again!");
            japanfood();
        }
    }
    public static void chinesefood(){
        Scanner menu4food = new Scanner(System.in);
        int chinese;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tChinese Foods");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t* Bebek Panggang    \t\tRp 150.000,00");
        System.out.println("\t\t* Sapi Lada Hitam   \t\tRp 100.000,00");
        System.out.println("\t\t* Ayam Kung Pao     \t\tRp 70.000,00");
        System.out.println("\t\t* Lumpia Udang      \t\tRp 30.000,00");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1. Back");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        chinese = menu4food.nextInt();

        hapusLayar bersihkanLayar = new hapusLayar();
        bersihkanLayar.layarClear();

        if (chinese == 1) {
            menuResto4();
        } else {
            System.out.println("Your input is wrong. Please try again!");
            chinesefood();
        }
    }
}

