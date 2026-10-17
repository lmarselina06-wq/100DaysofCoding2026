import java.util.Scanner;
public class day46 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("=== MENU YANG TERSEDIA ===");
        System.out.println("1. Pop ice");
        System.out.println("2. Alpukat kocok");
        System.out.println("3. Jus apel");
        System.out.println("4. Kopi");
        System.out.println("==========================");
        System.out.println("pilih menu 1 - 4");
        int menu = in.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Pesanan di proses: 1. Pop Ice");
                break;
            case 2:
                System.out.println("Pesanan di proses: 2. Alpukat kocok");
                break;
            case 3:
                System.out.println("Pesanan di proses: 3. Jus apel");
                break;
            case 4:
                System.out.println("Pesanan di proses: 4. Kopi");
                break;
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }
    }
}
