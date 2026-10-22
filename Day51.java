import java.util.Scanner;
public class day51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan tinggi segitiga: ");
        int tinggi =  in.nextInt();
        for(int baris = 1; baris <= tinggi; baris++){
            for(int angka = 1; angka <= baris; angka++){
                System.out.println(angka + " ");
            }
            System.out.println();
        }

        in.close();
    }
    
}
