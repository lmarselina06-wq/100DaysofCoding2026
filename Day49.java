import java.util.Scanner;
public class day49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();

        String status = (nilai >= 75)?"LULUS":"TIDAK LULUS";
        System.out.println("Status Anda: "+ status); 

        in.close();
    }
}
