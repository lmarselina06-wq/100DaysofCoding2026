import java.util.Scanner;
public class day59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai M: ");
        int M = in.nextInt();
        System.out.print("Masukkan nilai N: ");
        int N = in.nextInt();

        System.out.println("Bilangan Kelipatan "+ M +" dari 1 sampai "+ N +" adalah");
        for(int i = M; i <= N; i += M){
            System.out.println(i);
        }
        in.close();
    }
}
