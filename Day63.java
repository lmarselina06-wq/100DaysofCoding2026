import java.util.Scanner;
public class day63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        long hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil *= M;
        }
        System.out.println(M + " pangkat " + N + " = " + hasil);

        input.close();
    }
}
