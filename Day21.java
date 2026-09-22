package koding.src;
import java.util.Scanner;
public class PendataanUKM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahunSekarang = 2026;

        System.out.print("Nama: ");
        String namaStr = input.nextLine();

        System.out.print("Umur: ");
        String umurStr = input.nextLine();

        System.out.print("Tinggi Badan: ");
        String tinggiStr = input.nextLine();

        System.out.print("Berat Badan: ");
        String beratStr = input.nextLine();

        System.out.print("Semester: ");
        String semesterStr = input.nextLine();

        System.out.print("IPK: ");
        String ipkStr = input.nextLine();

        System.out.print("NIM: ");
        String nimStr = input.nextLine();

        System.out.print("Jumlah Penghargaan: ");
        String penghargaanStr = input.nextLine();

        System.out.print("Kode Kelas: ");
        String kelasStr = input.nextLine();

        int umur = Integer.parseInt(umurStr); 
        double tinggiCm = Double.parseDouble(tinggiStr); 
        double beratKg = Double.parseDouble(beratStr); 
        short semester = Short.parseShort(semesterStr); 
        float ipk = Float.parseFloat(ipkStr); 
        long nim = Long.parseLong(nimStr); 
        byte penghargaan = Byte.parseByte(penghargaanStr);
        char kodeKelas = kelasStr.charAt(0);

        int tahunLahir = tahunSekarang - umur;
        int totalPoin = (penghargaan * 10) + (semester * 5);
        double tinggiMeter = tinggiCm / 100;

        char inisial = namaStr.charAt(0);

        System.out.println("\n--- Hasil Pendataan ---");
        System.out.println("Nama: " + namaStr + " (Inisial: " + inisial + ")");
        System.out.println("Umur: " + umur + " tahun, Perkiraan Lahir: " + tahunLahir);
        System.out.println("Tinggi: " + tinggiCm + " cm (" + tinggiMeter + " m), Berat: " + beratKg + " kg");
        System.out.println("Semester: " + semester + ", IPK: " + ipk + ", NIM: " + nim);
        System.out.println("Kode Kelas: " + kodeKelas + ", Jumlah Penghargaan: " + penghargaan);
        System.out.println("Total Poin Prestasi: " + totalPoin);

        input.close();
    }
}
