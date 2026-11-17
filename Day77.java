public class day77 {
public static void main(String[] args) {

String teks = "Belajar Java di VS Code";
String teks2 = "belajar java di vs code";

System.out.println("=== METHOD STRING ===");

System.out.println("Teks asli : " + teks);

System.out.println("Jumlah karakter : " + teks.length());

System.out.println("Huruf besar : " + teks.toUpperCase());

System.out.println("Huruf kecil : " + teks.toLowerCase());

System.out.println("Karakter ke-0 : " + teks.charAt(0));

System.out.println("Substring : " + teks.substring(8, 12));

System.out.println("Ada kata Java? : " + teks.contains("Java"));

System.out.println("equals : " + teks.equals(teks2));

System.out.println("Ignore case : " + teks.equalsIgnoreCase(teks2));

System.out.println("Replace : "
+ teks.replace("Java", "Python"));

System.out.println("Posisi Java : " + teks.indexOf("Java"));

System.out.println("Diawali Belajar : "
+ teks.startsWith("Belajar"));

System.out.println("Diakhiri Code : "
+ teks.endsWith("Code"));

String tambahan = " itu menyenangkan!";
System.out.println("Concat : "
+ teks.concat(tambahan));
}
}
