public class day83 {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
        int jumlah = 0;

        for (int i = 0; i < angka.length; i++) {
            jumlah = jumlah + angka[i];
        }
        System.out.print("Isi array: ");
        for (int nilai : angka) {
            System.out.print(nilai + " ");
        }

        System.out.println("\nJumlah seluruh elemen array = " + jumlah);
    }
}
