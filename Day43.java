import java.util.Scanner;
public class day43 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("masukkan angka batas akhir: ");
        int batas = in.nextInt();
      
        System.out.println("hasil percetakan 1 sampai " + batas + ":");
        for (int i = 1; i <=  batas; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " = kelipatan 3 dan 5");
            }else if(i % 3 == 0){
                System.out.println(i + " = kelipatan 3");
            }else if(i % 5 == 0){
                System.out.println(i + " = kelipatan 5");
            }else{
                System.out.println(i + " = bukan kelipatan 3 atau 5");
            }
        }
        in.close();
    }
}
