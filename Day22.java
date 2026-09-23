package koding.src;
public class day {
    public static void main(String[] args) {
        
        // Nilai awal
        int a = 10;
        int b = 20;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
      
        // Proses menukar pakai variabel bantuan (temp)
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nSesudah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
