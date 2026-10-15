import java.util.Scanner;
public class day44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan nilai 0 - 100");
        double nilai = in.nextDouble();
        String Predikat = null;
        String Keterangan = null;

        if(nilai < 0 || nilai > 100){
            System.out.println("\nNilai tidak valid! harus antara 0 - 100.");
        }else {
            if(nilai >= 85){
                Predikat = "A";
                Keterangan = "Sangat Baik";
            }else if(nilai >= 70){
                Predikat = "B";
                Keterangan = "Baik";
            }else if(nilai >= 60){
                Predikat = "C";
                Keterangan = "Cukup";
            }else if(nilai >= 50){
                Predikat =  "D";
                Keterangan = "Kurang";
            }else{
                Predikat = "E";
                Keterangan = "Sangat Kurang / Tidak Lulus";
            }
            System.out.println("======================");
            System.out.println("Nilai Angka : "+ nilai);
            System.out.println("Predikat    : "+ Predikat);
            System.out.println("Keterangan  : "+ Keterangan);
            System.out.println("======================");
        }
        in.close();
    }
}
