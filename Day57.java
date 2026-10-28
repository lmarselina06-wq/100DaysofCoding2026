import java.util.Scanner;
public class day57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("");
        int N = in.nextInt();
        System.out.println("\nAngka Ganjil dari 1 sampai"+ N +".");
        for(int i = 1; i<= N; i++){
            if(i % 2 != 0){
                System.out.print(i +" ");
            }
        }
        System.out.println("\nAngka Genap dari 1 sampai"+ N +"."); 
        for (int i = 1; i <= N; i++){
            if(i % 2 == 0){
                System.out.print(i +" ");
            }
        }
        in.close();
    }
}
