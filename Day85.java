import java.util.Scanner;

public class LatihanArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka (minimal 5): ");
        int jumlah = input.nextInt();

        if (jumlah < 5) {
            System.out.println("Jumlah angka harus minimal 5!");
            input.close();
            return;
        }

        int[] angka = new int[jumlah];
      
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }
        System.out.println("\nIsi array:");

        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        input.close();
    }
}
