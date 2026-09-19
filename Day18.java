public class day18 {
    public static void main(String[] args) {
    //konversi otomatis (dari tipe data kecil ke besar)
    byte angkaByte = 10;
    short angkaShort = angkaByte;
    int angkaInt = angkaShort;
    long angkaLong = angkaInt;
    float angkaFloat = angkaLong;
    double angkaDouble = angkaFloat;

    System.out.println("Nilai awal (byte)\t: " + angkaByte);
    System.out.println("Konversi ke short\t: " + angkaShort);
    System.out.println("konversi ke int\t\t: " + angkaInt);
    System.out.println("Konversi ke long\t: " + angkaLong);
    System.out.println("Konversi ke float\t: " + angkaFloat);
    System.out.println("Konversi ke double\t: " + angkaDouble);

    }
}
