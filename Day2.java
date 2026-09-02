public class biodata {
    public static void main(String[] args) {
        //deklarasi variabel biodata
        String nama = "Marselina";
        String alamat = "Mamasa";
        int umur  = 18;
        Double tinggi = 155.4;

        // 1. menggunakan system.out.println (mencetak lalu membuat ke baris baru secara otomatis)
        //println digunakan ketika kita mau membuat baris baru pada codingan 
       System.out.println("===Menggunakan system.out.println===");
        System.out.println("Nama :" + nama);
        System.out.println("Alamat :" + alamat);
        System.out.println("umur :" + umur);
        System.out.println("tinggi :" + tinggi);

        // 2. menggunakan system.out.print (mencetak tanpa membuat baris baru)
        //print digunakan untuk mencetak sebuah kalimat
       //yg bersambung secara vertilakal
        System.out.print("===Menggunakan system.out.print==="); 
        System.out.print("Nama :" + nama + "\n");
        System.out.print("Alamat :" + alamat + "\n");
        System.out.print("umur :" + umur + "\n");
        System.out.print("tinggi :" + tinggi + "cm\n\n");

        // 3. menggunakan system.out.printf (mencetak dengan format khusus)
         /*printf digunakan dalam mencetak fotmat yg lebih spesifik
         * atau pemagilan program yg memadukan angka dan string
         * dengan menggunakan :
         * %d untuk integer;
         * %f untuk angka desimal
         * dan %s untuk string
         */
        System.out.printf("===Menggunakan system.out.printf==="); 
        System.out.printf("Nama : %%s%n", nama);
        System.out.printf("Alamat : %%s%n", umur);
        System.out.printf("umur :%%d tahun%n", umur);
        System.out.printf("tinggi : %%.1f cm%n", tinggi);

    }
}
