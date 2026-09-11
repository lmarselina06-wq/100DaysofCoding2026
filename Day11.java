import java.util.Scanner;
public class day11 {
    public static void main(String[] args) {
        /*Marselina merupakan seorang mahasiswa yang sedang membuat program data sederhana untuk
        menampilkan biodata dirinya. program tersebut harus menerima beberapa data diri dari pengguna,
        yaitu nama, umur, tinggi badan, dan jenis kelamin.*/
        // buatlah program java yang dapat menerima keempat data tersebut melalui input pengguna
        //kemudian tampilkan seluruh data dalam format biodata

        // deklarasi variabel
        String nama;
        int umur;
        double tinggi_badan;
        char jenis_kelamin;
    
        // input data dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Nama = ");
        nama = input.nextLine();
        System.out.print("umur = ");
        umur = input.nextInt();
        System.out.print("tinggi_badan = ");
        tinggi_badan = input.nextDouble();
        System.out.print("jenis_kelamin = ");
        jenis_kelamin = input.next().charAt(0);

        // menampilkan output menggunakan printf dan \t untuk merapikan
        System.out.println("\n=== BIODATA ===");
        System.out.printf("Nama\t\t: %s\n", nama);
        System.out.printf("Umur\t\t: %d tahun\n", umur);
        System.out.printf("Tinggi_badan\t: %.1f cm\n", tinggi_badan);
        System.out.printf("Jenis_kelamin\t: %c\n", jenis_kelamin);

    }
}
