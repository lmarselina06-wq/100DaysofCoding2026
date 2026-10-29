import java.util.Scanner;
public class day58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("");
        int N = in.nextInt();
        System.out.println("\nAngka Ganjil dari N sampai "+ 1 +".");
        for(int i = N; i>= 1; i--){
            if(i % 2 != 0){
                System.out.print(i +" ");
            }
        }
        System.out.println("\nAngka Genap dari N sampai "+ 1 +"."); 
        for (int i = N; i >= 1; i--){
            if(i % 2 == 0){
                System.out.print(i +" ");
            }
        }
        in.close();
    }
}
