import java.util.Scanner;
public class day30 {
    public static void main(String[] args) {
        // operasi perbandingan <= dan >=
        Scanner v = new Scanner(System.in);
        System.out.print("masukkan angka pertama: ");
        int angka1 = v.nextInt();
        System.out.print("masukkan angka kedua: ");
        int angka2 = v.nextInt();
        System.out.println("\nHasil  Perbandingan: ");
        //operator <=
        System.out.println(angka1 + " <= " + angka2 + " : " + (angka1 <= angka2));
        //operator >=
        System.out.println(angka1 + " >= " + angka2 + " : " + (angka1 >= angka2));
    }
}
