 import java.util.Scanner;
 public class day00 {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String nama;
     int umur;
     double tinggi_badan;
     char jenis_kelamin;

     System.out.print("nama = ");
     nama = input.nextLine();
     System.out.println("umur = ");
     umur = input.nextInt();
     System.out.print("tinggi_badan = ");
     tinggi_badan = input.nextDouble();
     System.out.print("jenis_kelamin = ");
     jenis_kelamin = input.next().charAt(0);

     System.out.printf("Nama\t\t: %s\n", nama);
     System.out.printf("Umur\t\t: %d tahun\n", umur);
     System.out.printf("Tinggi_badan\t: %.1f cm\n", tinggi_badan);
     System.out.printf("Jenis-_kelamin\t: %c\n", tinggi_badan);
     input.close();
     }
}
