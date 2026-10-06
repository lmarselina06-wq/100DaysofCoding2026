import java.util.Scanner;
public class day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Masukkan kode tiket: ");
        int kodeTiket = input.nextInt();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan saldo: ");
        int saldo = input.nextInt();

        // Menghitung nilai pemeriksaan
        int nilaiPemeriksaan = (kodeTiket * umur) % 100;

        // Menentukan status tiket
        boolean valid = false;

        if (nilaiPemeriksaan >= 20 && nilaiPemeriksaan <= 80) {

            if (umur < 17) {
                if (saldo >= 100000) {
                    valid = true;
                }
            } else {
                if (saldo >= 50000) {
                    valid = true;
                }
            }
        }
        System.out.println("\nNilai Pemeriksaan: " + nilaiPemeriksaan);
      
        if (valid) {
            System.out.println("Status Tiket: VALID");
        } else {
            System.out.println("Status Tiket: TIDAK VALID");
        }

        input.close();
    }
}
