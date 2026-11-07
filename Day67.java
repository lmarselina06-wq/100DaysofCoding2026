import java.util.Scanner;
public class day67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        input.close();
    }
}
