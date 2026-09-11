public class day10 {
    public static void main(String[] args) {
        // deklarasi variabel 
        byte level;
        short Jumlah_item;
        int exp;
        long gold;
      
        // nilai awal karakter 
        level = 10;
        Jumlah_item = 50;
        exp = 1000;
        gold = 50000;
      
        // menampilkan batas nilai maksimal setiap tipe data
        System.out.println("=== BATAS MAKSIMAL TIPE DATA ===");
        System.out.println("Maks Byte: " + Byte.MAX_VALUE);
        System.out.println("Maks Short: " + Short.MAX_VALUE);
        System.out.println("Maks Int: " + Integer.MAX_VALUE);
        System.out.println("Maks Long: " + Long.MAX_VALUE);
      
        // manampilkan data awal
        System.out.println("=== DATA AWAL KARAKTER ===");
        System.out.println("level: " + level);
        System.out.println("Item: " + Jumlah_item);
        System.out.println("EXP: " + exp);
        System.out.println("Gold: " + gold);
      
        // update data setelah misi
        //mendapatkan misi untuk menambahkan 2 masing masing data
        level += 2;
        Jumlah_item += 5;
        exp += 250;
        gold += 10000;
      
        //menampilkan data setelah misi
        System.out.println("=== DATA SETELAH MISI ===");
        System.out.println("Level: " + level);
        System.out.println("Item: " + Jumlah_item);
        System.out.println("EXP: " + exp);
        System.out.println("Gold: " + gold);
    }
}
