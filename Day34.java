import java.util.Scanner;
public class day34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 90) {
            System.out.println("Nilai Huruf: A");
        } else if (nilai >= 80) {
            System.out.println("Nilai Huruf: B");
        } else if (nilai >= 70) {
            System.out.println("Nilai Huruf: C");
        } else if (nilai >= 60) {
            System.out.println("Nilai Huruf: D");
        } else {
            System.out.println("Nilai Huruf: E");
        }

        input.close();
    }
}
