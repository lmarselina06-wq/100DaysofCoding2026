public class day55 {

    public static int cariAngka(int target) {

        for (int i = 1; i <= 10; i++) {

            if (i == 4) {
                continue;
            }

            if (i == target) {
                return i;
            }

            if (i == 9) {
                break;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int hasil = cariAngka(7);

        if (hasil != -1) {
            System.out.println("Angka ditemukan: " + hasil);
        } else {
            System.out.println("Angka tidak ditemukan");
        }
    }
}
