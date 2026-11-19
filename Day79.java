import java.util.Scanner;
public class day79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];
        System.out.println("Masukkan 5 nilai:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        int selisih = tertinggi - terendah;
        System.out.println("Nilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah   = " + terendah);
        System.out.println("Selisih          = " + selisih);

        input.close();
    }
}
