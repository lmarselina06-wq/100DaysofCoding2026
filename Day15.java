import java.util.Scanner;
public class day15 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int jumlahBuku = in.nextInt();
    int hargaPerBuku = in.nextInt();
    int jumlahOrang = in.nextInt();

    int totalHarga = jumlahBuku * hargaPerBuku;
    int biayaPerOrang = totalHarga / jumlahOrang;

    System.out.println("jumlah buku = " + jumlahBuku);
    System.out.println("Harga per buku = Rp" + hargaPerBuku);
    System.out.println("Total  harga = Rp" + totalHarga);
    System.out.println("Jumlah orang = " + jumlahOrang);
    System.out.println("Biaya per orang = Rp" + biayaPerOrang);

    }
}
