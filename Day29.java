import java.util.Scanner;
public class day29 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        // OPERATOR PERBANDINGAN < DAN >
        System.out.print("Masukkan angka pertama : ");
        int angka1 = v.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka2 = v.nextInt();
        System.out.println("\nHasil Perbandingan : ");
        System.out.println(angka1 + " > " + angka2 + " = " + (angka1 > angka2));
        System.out.println(angka1 + " < " + angka2 + " = " + (angka1 < angka2));
    }
    
}
