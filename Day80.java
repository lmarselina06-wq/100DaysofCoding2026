public class AksesArray {
    public static void main(String[] args) {
      
        String[] nama = {"Andi", "Budi", "Citra", "Dina", "Eko"};
      
        System.out.println("Indeks 0 = " + nama[0]);
        System.out.println("Indeks 1 = " + nama[1]);
        System.out.println("Indeks 2 = " + nama[2]);
        System.out.println("Indeks 3 = " + nama[3]);
        System.out.println("Indeks 4 = " + nama[4]);

        nama[1] = "Bagas";

        System.out.println("\nSetelah indeks 1 diubah:");
        System.out.println("Indeks 1 = " + nama[1]);
    }
}
