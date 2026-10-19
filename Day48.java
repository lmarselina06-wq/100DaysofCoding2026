import java.util.Scanner;
public class day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        double angka1 = in.nextDouble();
        System.out.println("Masukkan operator yang digunakan (+,-,*,/,%): ");
        char operator = in.next().charAt(0);
        System.out.println("Masukkan angka kedua: ");
        double angka2 = in.nextDouble();

        double hasil;
        switch (operator) {
            case '+' :
                hasil = angka1 + angka2;
                System.out.println("Hasil= "+ hasil);
                break; 
            case '-' :
                hasil = angka1 - angka2;
                System.out.println("Hasil= "+ hasil);
                break;
            case '*' :
                hasil = angka1 * angka2;
                System.out.println("Hasil= "+ hasil);
                break;
            case '/' :
                if(angka2 != 0){
                hasil = angka1 / angka2;
                    System.out.println("Hasil = "+ hasil);
                }else{
                    System.out.println("Error: pembagi dengan nol tidak diperbolehkan");
                }
                break;
            case '%' :
                hasil = angka1 % angka2;
                System.out.println("Hasil= "+ hasil);
                break;
            default:
                System.out.println("pilihan tidak valid");
                break;
        }
    }
}
