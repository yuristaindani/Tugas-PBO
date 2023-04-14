import javax.swing.*;
import java.util.Scanner;

public class Restaurant {
    public static void restaurantList() {
        Scanner list = new Scanner(System.in);
        int pilihList;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t1. Italiano Resto");
        System.out.println("\t\t\t\t2. Rasa Lokal Resto");
        System.out.println("\t\t\t\t3. Japanese Resto");
        System.out.println("\t\t\t\t4. Chinese Resto");
        System.out.println("\t\t\t\t5. Back");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        pilihList = list.nextInt();

        hapusLayar clear = new hapusLayar();
        clear.layarClear();

        switch (pilihList) {
            case 1:
                italiano();
                break;
            case 2:
                rasaLokal();
                break;
            case 3:
                japanese();
                break;
            case 4:
                chinese();
                break;
            case 5:
                loginAdmin tampilinAdmin = new loginAdmin();
                tampilinAdmin.displayAdmin();
                break;
            default:
                System.out.println("Your input is wrong! Please try again (number 1-5)");
                restaurantList();
        }
    }

    public static void italiano() {
        Scanner resto1 = new Scanner(System.in);
        int restoItaliano;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tItaliano Resto");
        System.out.println("\t\t\t\t");
        System.out.println("\t\tAddress: 221B Baker Street, Marylebone, London NW1 6XE");
        System.out.println("\t\tContact Person: 020 123 4567");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1.Menu");
        System.out.println("\t\t\t\t\t\t2.Back");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        restoItaliano = resto1.nextInt();

        hapusLayar clean = new hapusLayar();
        clean.layarClear();

        switch (restoItaliano) {
            case 1:
                menuAdmin italiaMenu = new menuAdmin();
                italiaMenu.menuResto1();
                break;
            case 2:
                restaurantList();
                break;
            default:
                System.out.println("Your input is wrong. Please try again! (Number 1/2)");
                italiano();
        }
    }

    public static void rasaLokal() {
        Scanner resto2 = new Scanner(System.in);
        int restoRasalokal;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tRasa Lokal Resto");
        System.out.println("\t\t\t\t");
        System.out.println("\t\tAddress: 10 Downing Street, Westminster, London SW1A 2AA");
        System.out.println("\t\tContact Person: 020 123 5789");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1.Menu");
        System.out.println("\t\t\t\t\t\t2.Back");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        restoRasalokal = resto2.nextInt();

        hapusLayar bersih = new hapusLayar();
        bersih.layarClear();

        switch (restoRasalokal) {
            case 1:
                menuAdmin lokalMenu = new menuAdmin();
                lokalMenu.menuResto2();
                break;
            case 2:
                restaurantList();
                break;
            default:
                System.out.println("Your input is wrong. Please try again! (Number 1/2)");
                rasaLokal();
        }
    }

    public static void japanese() {
        Scanner resto3 = new Scanner(System.in);
        int restoJapan;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tJapanese Resto");
        System.out.println("\t\t\t\t");
        System.out.println("\t\tAddress: 160 Fleet Street, City of London, London EC4A 2DQ");
        System.out.println("\t\tContact Person: 020 123 0314");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1.Menu");
        System.out.println("\t\t\t\t\t\t2.Back");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        restoJapan = resto3.nextInt();

        hapusLayar hitam = new hapusLayar();
        hitam.layarClear();

        switch (restoJapan) {
            case 1:
                menuAdmin japanMenu = new menuAdmin();
                japanMenu.menuResto3();
                break;
            case 2:
                restaurantList();
                break;
            default:
                System.out.println("Your input is wrong. Please try again! (Number 1/2)");
                japanese();
        }
    }
    public static void chinese() {
        Scanner resto4 = new Scanner(System.in);
        int restoChinesse;

        System.out.println("\t\t=========================================");
        System.out.println("\t\t\t\t\t\tChinese Resto");
        System.out.println("\t\t\t\t");
        System.out.println("\t\tAddress: 66 Old Compton Street, Soho, London W1D 4UH");
        System.out.println("\t\tContact Person: 020 123 1101");
        System.out.println("\t\t\t\t");
        System.out.println("\t\t\t\t\t\t1.Menu");
        System.out.println("\t\t\t\t\t\t2.Back");
        System.out.println("\t\t=========================================");
        System.out.print("\t\tI choose: ");
        restoChinesse = resto4.nextInt();

        hapusLayar layarBersih = new hapusLayar();
        layarBersih.layarClear();

        switch (restoChinesse) {
            case 1:
                menuAdmin chineseMenu = new menuAdmin();
                chineseMenu.menuResto4();
                break;
            case 2:
                restaurantList();
                break;
            default:
                System.out.println("Your input is wrong. Please try again! (Number 1/2)");
                chinese();
        }
    }
}