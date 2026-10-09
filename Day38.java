import java.util.Scanner;
public class day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     APLIKASI MENU RESTORAN         ");
        System.out.println("====================================");
        System.out.println("1. Paket Ayam Goreng + Nasi  (Rp 20.000)");
        System.out.println("2. Paket Bebek Bakar + Nasi  (Rp 30.000)");
        System.out.println("3. Es Teh Manis Jumbo        (Rp  5.000)");
        System.out.println("4. Keluar Aplikasi");
        System.out.println("====================================");
  
        System.out.print("Masukkan nomor menu pilihan Anda (1-4): ");
        int pilihan = input.nextInt();
        
        System.out.println("------------------------------------");
        
        if (pilihan == 1) {
            System.out.println("Anda memilih: Paket Ayam Goreng + Nasi");
            System.out.println("Total yang harus dibayar: Rp 20.000");
        } 
        else if (pilihan == 2) {
            System.out.println("Anda memilih: Paket Bebek Bakar + Nasi");
            System.out.println("Total yang harus dibayar: Rp 30.000");
        } 
        else if (pilihan == 3) {
            System.out.println("Anda memilih: Es Teh Manis Jumbo");
            System.out.println("Total yang harus dibayar: Rp 5.000");
        } 
        else if (pilihan == 4) {
            System.out.println("Terima kasih! Keluar dari aplikasi...");
        } 
        else {
            System.out.println("Pilihan tidak valid! Silakan jalankan ulang program.");
        }
        
        System.out.println("====================================");
        
        input.close();
    }
}
