import java.util.Scanner;

public class MethodStringManipulasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Masukkan sebuah kalimat: ");
        String teks = input.nextLine();

        String teksBersih = teks.trim();
      
        String potongan = "";
        if (teksBersih.length() >= 5) {
            potongan = teksBersih.substring(0, 5);
        } else {
            potongan = teksBersih;
        }
        String sisa = "";
        if (teksBersih.length() > 5) {
            sisa = teksBersih.substring(5);
        }

        String gantiHuruf = teksBersih.replace('a', '@');
        // Ganti kata 'Majene' jadi 'Sulawesi Barat'
        String gantiKata = teksBersih.replace("Majene", "Sulawesi Barat");

        System.out.println("\n--- Hasilnya ---");
        System.out.println("Teks asli        : [" + teks + "]");
        System.out.println("trim()           : [" + teksBersih + "]");
        System.out.println("substring(0,5)   : " + potongan);
        System.out.println("substring(5)     : " + sisa);
        System.out.println("replace('a','@') : " + gantiHuruf);
        System.out.println("replace kata     : " + gantiKata);

        input.close();
    }
}
