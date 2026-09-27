import java.util.Scanner;
public class Eval {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print("masukkan nama\t\t: ");
        String nama = v.nextLine();
        System.out.print("masukkan nim\t\t: ");
        String nim = v.nextLine();
        System.out.print("masukkan kelas\t\t: ");
        char kelas = v.next().charAt(0);
        System.out.print("masukkan umur\t\t: ");
        int umur = v.nextInt();
        System.out.print("masukkan prodi\t\t: ");
        v.nextLine();
        String prodi = v.nextLine();
        System.out.print("masukkan ipk\t\t: ");
        double ipk = v.nextDouble();
        System.out.print("masukkan keaktifan\t: ");
        boolean keaktifan = v.nextBoolean();
        System.out.println("===BIODATA MAHASISWA===");
        System.out.println("Nama\t\t: "+ nama);
        System.out.println("Nim\t\t: "+ nim);
        System.out.println("Kelas\t\t: "+ kelas);
        System.out.println("Umur\t\t: "+ umur + "tahun");
        System.out.println("Prodi\t\t: "+ prodi);
        System.out.println("IPK\t\t: "+ ipk + 0);
        System.out.println("Status Aktif\t: "+ keaktifan);
        System.out.println("=======================");

    }
}
