import java.util.Scanner;
public class day33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Meminta input nilai
        System.out.print("Masukkan nilai Anda: ");
        int nilai = in.nextInt();

        // Percabangan if-else
        if (nilai >= 75) {
            System.out.println("Selamat, Anda dinyatakan LULUS!");
        } else {
            System.out.println("Maaf, Anda dinyatakan TIDAK LULUS.");
        }

        in.close();
    }
}
