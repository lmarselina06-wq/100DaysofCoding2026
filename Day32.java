import java.util.Scanner;
public class LatihanOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai pertama: ");
        int nilai1 = input.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int nilai2 = input.nextInt();

        // OPERATOR ARITMATIKA
        int penjumlahan = nilai1 + nilai2;
        int pengurangan = nilai1 - nilai2;
        int perkalian = nilai1 * nilai2;
        int pembagian = nilai1 / nilai2;
        int sisa = nilai1 % nilai2;

        System.out.println("\n=== OPERATOR ARITMATIKA ===");
        System.out.println("Penjumlahan : " + penjumlahan);
        System.out.println("Pengurangan : " + pengurangan);
        System.out.println("Perkalian   : " + perkalian);
        System.out.println("Pembagian   : " + pembagian);
        System.out.println("Sisa bagi   : " + sisa);

        // OPERATOR PERBANDINGAN
        boolean lebihBesar = nilai1 > nilai2;
        boolean lebihKecil = nilai1 < nilai2;
        boolean samaDengan = nilai1 == nilai2;

        System.out.println("\n=== OPERATOR PERBANDINGAN ===");
        System.out.println("Nilai 1 > Nilai 2  : " + lebihBesar);
        System.out.println("Nilai 1 < Nilai 2  : " + lebihKecil);
        System.out.println("Nilai 1 == Nilai 2 : " + samaDengan);

        // OPERATOR LOGIKA
        boolean kondisi1 = nilai1 >= 70;
        boolean kondisi2 = nilai2 >= 70;

        boolean keduanyaLulus = kondisi1 && kondisi2;
        boolean salahSatuLulus = kondisi1 || kondisi2;
        boolean tidakLulus = !kondisi1;

        System.out.println("\n=== OPERATOR LOGIKA ===");
        System.out.println("Keduanya >= 70 : " + keduanyaLulus);
        System.out.println("Salah satu >= 70 : " + salahSatuLulus);
        System.out.println("Nilai 1 tidak >= 70 : " + tidakLulus);

        // OPERATOR PENUGASAN
        int angka = nilai1;

        angka += nilai2;
        System.out.println("\n=== OPERATOR PENUGASAN ===");
        System.out.println("Setelah += : " + angka);

        angka -= nilai2;
        System.out.println("Setelah -= : " + angka);

        angka *= 2;
        System.out.println("Setelah *= 2 : " + angka);

        angka /= 2;
        System.out.println("Setelah /= 2 : " + angka);

        // INCREMENT DAN DECREMENT
        int jumlah = nilai1;

        System.out.println("\n=== INCREMENT & DECREMENT ===");
        System.out.println("Nilai awal : " + jumlah);

        jumlah++;
        System.out.println("Setelah ++ : " + jumlah);

        jumlah--;
        System.out.println("Setelah -- : " + jumlah);

        // OPERATOR TERNARY
        String hasil = (nilai1 >= 70) ? "Lulus" : "Tidak Lulus";

        System.out.println("\n=== OPERATOR TERNARY ===");
        System.out.println("Status " + nama + " : " + hasil);

        // KOMBINASI BERBAGAI OPERATOR
        boolean hasilAkhir =
                (nilai1 >= 70 && nilai2 >= 70)
                || (nilai1 + nilai2 >= 150);

        System.out.println("\n=== KOMBINASI OPERATOR ===");
        System.out.println("Hasil kombinasi : " + hasilAkhir);

        input.close();
    }
}
