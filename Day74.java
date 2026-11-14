import java.util.Scanner;

public class MethodStringDasar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Masukkan sebuah kata / kalimat: ");
        String teks = input.nextLine();
      
        int panjang = teks.length();

        String hurufBesar = teks.toUpperCase();
      
        String hurufKecil = teks.toLowerCase();

        System.out.println("\n--- Hasilnya ---");
        System.out.println("Teks asli      : " + teks);
        System.out.println("Panjang teks   : " + panjang + " karakter");
        System.out.println("Huruf Besar    : " + hurufBesar);
        System.out.println("Huruf Kecil    : " + hurufKecil);

        input.close();
    }
}
