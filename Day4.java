public class Day4{
    public static void main(String[] args) throws Exception {
    // byte / ukuran = 1 byte / jumlah bit = 8 bit
    // paling kecil cukup buat menyimpan umur,nilai 0-100

    // short / ukuran = 2 byte / jumlah bit 16 bit
    // 2x lipat dari byte,buat data sedang

    // int / ukuran = 3 byte / jumlah bit = 32 bit
    // default bilangan bulat di java, paling sering di pakai

    // long / ukuran =  4 bit / jumlah bit = 62 bit
    // paling besar,buat angka besar

   byte angka1 = 20;
   short angka2 = 200;
   int angka3 = 1200;
   long angka4 = 1400000;
   System.out.println("nilai angka 1 = "+ angka1);
   System.out.println("nilai angka 2 = "+ angka2);
   System.out.println("nilai angka 3 = "+ angka3);
   System.out.println("nilai angka 4 = "+ angka4);

    }

}
