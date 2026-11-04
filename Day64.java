import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah " + faktorial);

        input.close();
    }
}
