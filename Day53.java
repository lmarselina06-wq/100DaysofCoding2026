import java.util.Scanner;
public class day53 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int pilihan;
        System.out.print("Masukkan angka1: ");
        int angka1 = n.nextInt();
        System.out.print("Masukkan angka2: ");
        int angka2 = n.nextInt();

        do{
            System.out.println("== DAFTAR MENU ==");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Perkalian");
            System.out.println("3. Pengurangan");
            System.out.println("4. Berhenti");
            System.out.println("=================");
            System.out.print("Pilihan: ");
            pilihan = n.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Hasil penjumlahan : "+ (angka1 + angka2));
                    break;
                case 2:
                    System.out.println("Hasil perkalian : "+ (angka1 * angka2));
                    break;
                case 3:
                    System.out.println("Hasil pengurangan : "+ (angka1 - angka2));
                    break;
                case 4:
                    System.out.println("Tidak ada operasi, program berhenti");
                    break;
            
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }while (pilihan != 4);
        n.close();
    }
}
