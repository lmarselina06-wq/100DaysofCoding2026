import java.util.Scanner;
public class day61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println("Hasil perkalian angka 1 sampai "+ N + ".");
        for(int i = 1; i <= N; i++){
            int hasil = i * N;
            System.out.println(i + " x "+ N + " = "+ hasil);
        }
        in.close();
    }
}
