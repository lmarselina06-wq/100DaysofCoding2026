import java.util.Scanner;
public class day60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int jumlah = 0;
        for(int i = 1; i <= N; i++){
            jumlah += i;
        }
        System.out.println("jumlah angka dari 1 sampai "+ N + " adalah "+ jumlah);
        in.close();
    }
}
