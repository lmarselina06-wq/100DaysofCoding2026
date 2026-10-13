import java.util.Scanner;
public class day42 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = in.nextDouble();
        System.out.print("Masukkan potongan bulanan: ");
        double potongan = in.nextDouble();
        double gajiBersih = gajiPokok - potongan;

        if (gajiBersih == 0 && gajiPokok > 0){
            System.out.println("\nGaji Bersih Nol: Harap Hubungi HRD");
        }else if(gajiBersih >= 5000000 && gajiBersih <= 10000000 && potongan >= 500000 && potongan <= 1000000){
            System.out.println("\nGaji Bersih Standar");
        }else if(gajiBersih < 5000000 || potongan > 1000000){
            System.out.println("\nGaji Bersih Terlalu Rendah atau\nPotongan Terlalu Besar");
        }else if(gajiBersih > 10000000 || potongan < 500000){
            System.out.println("\nGaji Bersih Tinggi atau\nPotongan Sangat Kecil");
        }
        in.close();
    }
}
