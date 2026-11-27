import java.util.Scanner;

public class LatihanArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];
        System.out.println("\n1. Masukkan Data Array");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println("\n2. Isi Array");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Index [" + i + "] = " + nilai[i]);
        }

        System.out.println("\n3. Mengubah Data Array");
        System.out.print("Masukkan index yang ingin diubah (0-4): ");
        int index = input.nextInt();

        if (index >= 0 && index < nilai.length) {
            System.out.print("Masukkan nilai baru: ");
            nilai[index] = input.nextInt();

            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Index tidak valid.");
        }
      
        System.out.println("\nArray setelah diubah:");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }

        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            total = total + nilai[i];
        }

        double rataRata = (double) total / nilai.length;

        System.out.println("\n\n4. Perhitungan Array");
        System.out.println("Total       : " + total);
        System.out.println("Rata-rata   : " + rataRata);
      
        int terbesar = nilai[0];
        int terkecil = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }

        System.out.println("Nilai terbesar : " + terbesar);
        System.out.println("Nilai terkecil : " + terkecil);

        System.out.println("\n5. Pencarian Data");
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int cari = input.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                System.out.println(
                    "Nilai " + cari + " ditemukan pada index " + i
                );
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + cari + " tidak ditemukan.");
        }
        System.out.println("\n=== PROGRAM SELESAI ===");

        input.close();
    }
             }
