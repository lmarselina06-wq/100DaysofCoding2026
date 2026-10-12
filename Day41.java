import java.util.Scanner;
public class day41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan suhu ruagan: ");
        int suhu = in.nextInt();
        System.out.print("Masukkan kelembapan ruangan: ");
        int kelembapan = in.nextInt();
        if(suhu >= 18 && suhu <= 28 && kelembapan >= 40 && kelembapan <= 60){
            System.out.println("\nRuangan Nyaman");
        }else if(suhu < 18 || kelembapan < 40){
            System.out.println("\nSuhu atau Kelembapan Terlalu Rendah");
        }else if(suhu > 28 || kelembapan > 60){
            System.out.println("\nSuhu atau Kelembapan Terlalu Tinggi");
        }
        in.close();
    }
}
