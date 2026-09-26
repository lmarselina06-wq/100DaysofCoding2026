import java.util.Scanner;
public class day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input jari-jari
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        // Menghitung luas lingkaran
        double luas = Math.PI * jariJari * jariJari;

        // Menampilkan ouput/hasil
        System.out.println("Jari-jari lingkaran = " + jariJari);
        System.out.println("Luas lingkaran = " + luas);

        input.close();
    }
}
