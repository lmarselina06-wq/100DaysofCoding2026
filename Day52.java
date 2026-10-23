import java.util.Scanner;
public class day52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pin;
        boolean benar = false;
       while (!benar) {
        System.out.print("Masukkan pin: ");
        pin = in.nextInt();

        if(pin == 123456){
            benar = true;
            System.out.println("Pin Benar. Akses diberikan");
        }else{
            System.out.println("PIN salah. silahkan coba lagi.");
        }
       }
        in.close();
    }
}
