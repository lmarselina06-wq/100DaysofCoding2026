import java.util.Scanner;
public class day72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        do{
            System.out.println("\n=== KANTIN KAMPUS===");
            System.out.println("1. Nasi goreng (Rp.15000)");
            System.out.println("2. Mie goreng (Rp. 12000)");
            System.out.println("3. Ayam geprek (Rp. 18000)");
            System.out.println("4. keluar");
            System.out.println("Pilih menu:");

            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("\nAnda memilih nasi goreng");
                    System.out.println("Harga: Rp.15000");
                    break;
                case 2:
                    System.out.println("\nAnda memilih mie goreng");
                    System.out.println("Harga: Rp.12000");
                    break;
                case 3:
                    System.out.println("\nAnda memilih ayam geprek");
                    System.out.println("Harga: Rp.18000");
                    break;
                case 4:
                    System.out.println("\nTerima kasih telah menggunakan layanan kantin!");
                    break;
                default:
                System.out.println("\nMenu tidak tersedia.");
            }
        }while(pilihan != 4);
    }
}

