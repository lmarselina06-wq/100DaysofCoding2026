import java.util.Scanner;
public class day86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] angka = {10, 25, 30, 45, 50, 65, 70};
        for (int i = 0; i < angka.length; i++){
            System.out.print(angka[i]+ " ");
        }
        int cari = in.nextInt();
        int posisi = -1;
        for(int i = 0; i < angka.length; i++){
            if(angka[i] == cari){
                posisi = i;
                break;
            }
        }
        if (posisi != -1){
            System.out.println("Angka "+ cari + "ditemukan!");
            System.out.println("Berada pada index ke-"+ posisi);
        }else{
            System.out.println("Angka "+ cari + " tidak ditemukan dalam array");
        }
        in.close();
    }
}
