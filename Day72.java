import java.util.Scanner;
public class day72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka;
        int total = 0;
        while (true) {
            System.out.print("Masukkan angka: ");
            angka = in.nextInt();
            if (angka < 0){
                break;
            }
            total += angka;
        }
        System.out.println("Total Penjumlahan = "+ total);
        in.close();
    }
}
