import java.util.Scanner;
public class day45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==== Menu Makanan & Minuman ====");
        System.out.println("1. Bakso bakar");
        System.out.println("2. Mie ayam");
        System.out.println("3. Ayam geprek");
        System.out.println("4. Sosis bakar");
        System.out.println("5. Alpukat kocok");
        System.out.println("6. Pop ice");
        System.out.println("7. Jus apel");
        System.out.println("Pilih menu 1 - 7");
        System.out.println("========================");
        int menu = in.nextInt();
        switch (menu) {
            case 1 :
                System.out.println("Pesanan di proses: 1. Bakso bakar");
                break;
            case 2 :
                System.out.println("Pesanan di proses: 2. Mie ayam");
                break;
            case 3 :
                System.out.println("Pesanan di proses: 3. Ayam geprek");
                break;
            case 4 :
                System.out.println("Pesanan di proses: 4. Sosis bakar");
                break;
            case 5 :
                System.out.println("Pesanan di proses: 5. Alpukat kocok");
                break;
            case 6 :
                System.out.println("Pesanan di proses: 6. Pop ice");
                break;
            case 7 :
                System.out.println("Pesanan di proses: 7. Jus apel");
                break;
            default:
                System.out.println("Menu tidak tersedia!");
                break;
        }
    }
}
