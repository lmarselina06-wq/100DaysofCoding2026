package koding.src;
import java.util.Scanner;
public class day20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        int nim = sc.nextInt();
        
        System.out.print("Masukkan umur : ");
        int umur = sc.nextInt();
        
        System.out.print("Masukkan tinggi badan : ");
        double tinggi = sc.nextDouble();

        // 1. Menggunakan String.valueOf()
        String sNim1 = String.valueOf(nim);
        String sUmur1 = String.valueOf(umur);
        String sTinggi1 = String.valueOf(tinggi);

        // 2. Menggunakan toString() bawaan wrapper
        String sNim2 = Integer.toString(nim);
        String sUmur2 = Integer.toString(umur);
        String sTinggi2 = Double.toString(tinggi);

        // 3. Menggunakan concatenation "" + 
        String sNim3 = "" + nim;
        String sUmur3 = "" + umur;
        String sTinggi3 = "" + tinggi;

        String gabungan = sUmur1 + sTinggi1.replace(".", "");

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.printf("NIM\t\t\t: %07d\n", nim);
        System.out.println("Umur\t\t\t: " + sUmur1 + " tahun");
        System.out.println("Tinggi Badan\t\t: " + sTinggi1 + " cm");
        System.out.println("Gabungan Umur + Tinggi\t: " + gabungan);

        sc.close();
    }
}
