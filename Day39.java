import java.util.Scanner;
public class eval {
    public static void main(String[] args) {
        Scanner v = new Scanner (System.in);
        int angka1 = v.nextInt();
        int angka2 = v.nextInt();
        char kode = v.next().charAt(0);
        int hasil = 0;
        if (kode == 'A'){
            hasil = angka1 + angka2;
        }else{
            if(kode == 'B'){
                hasil = angka1 - angka2;
            }else{
                if (kode == 'C'){
                    hasil = angka1*angka2;
                }else{
                    if (kode == 'D')
                        if(angka2 != 0){
                            hasil = angka1/angka2;
                        }else{
                            System.out.println("tidak bisa dibagi nol");
                            v.close();
                            return;
                        }else{
                            System.out.println("kode tidak valid");
                        }
                }
            }
        }
        System.out.println(hasil);
     }
}
