import java.util.Scanner;
public class day56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int total = 0;
        for(int i = 1; i <= N; i++){
            total += i;
            System.out.print(i +" ");
        }
        System.out.println();
        for(int i = N; i >= 1; i--){
            total += i;
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println(total);

    }
}
