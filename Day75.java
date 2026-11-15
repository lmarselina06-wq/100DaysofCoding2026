public class day75{
    public static void main(String[] args) {
      
        String teks1 = "Belajar Java";
        String teks2 = "Belajar Java";
        String teks3 = "belajar java";
        String teksKosong = "";
      
        System.out.println("=== equals() ===");
        System.out.println(teks1.equals(teks2));
        System.out.println(teks1.equals(teks3));

        System.out.println("\n=== equalsIgnoreCase() ===");
        System.out.println(teks1.equalsIgnoreCase(teks3));
      
        System.out.println("\n=== contains() ===");
        System.out.println(teks1.contains("Java"));
        System.out.println(teks1.contains("Python"));

        System.out.println("\n=== isEmpty() ===");
        System.out.println(teksKosong.isEmpty());
        System.out.println(teks1.isEmpty());
    }
}
