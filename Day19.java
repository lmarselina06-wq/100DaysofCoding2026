package koding.src;
public class day19 {
    public static void main(String[] args) {
    //type data besar
    double angkaDouble = 123.45;

    //konversi manual/paksa dari double ke int
    int angkaInt = (int) angkaDouble;
    System.out.println("nilai awal (double) : " + angkaDouble);
    System.out.println("setelah di konversi ke int : " + angkaInt);

    //long ke int
    long angkaLong = 100000L;
    int hasilInt = (int) angkaLong;
    System.out.println("\nnilai awal (long) : " + angkaLong);
    System.out.println("setelah di konversi ke int : " + hasilInt);
    
    //int ke short
    int angka = 30000;
    short hasilShort = (short) angka;
    System.out.println("\nnilai awal (int) : " + angka);
    System.out.println("setelah di konversi ke short : " + hasilShort);

    }    
}
