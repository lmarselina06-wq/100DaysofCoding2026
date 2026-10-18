import java.util.Scanner;
public class day47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Nama Nama Hari ===");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. sabtu");
        System.out.println("7. Minggu");
        System.out.println("=======================");
        System.out.println("Pilih 1 - 7");
        int hari = in.nextInt();
        switch (hari) {
            case 1 :
                System.out.println("Senin");
                break;
            case 2 :
                System.out.println("Selasa");
                break;
            case 3 :
                System.out.println("Rabu");
                break;
            case 4 :
                System.out.println("kamis");
                break;
            case 5 :
                System.out.println("Jumat");
                break;
            case 6 :
                System.out.println("Sabtu");
                break;
            case 7 :
                System.out.println("Minggu");
                break;
            default:
                System.out.println("ERROR! Silahkan memilih angka 1 - 7");
                break;
        }
    }
}
