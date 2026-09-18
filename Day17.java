public class day17 {
    public static void main(String[] args) {
    System.out.println("=== OPERATOR PENUGASAN ===");
    //1.operator penugasan dasar 
    int a = 20;
    System.out.println("\n1. nilai awal a = 20");
    System.out.println("a = "+ a);

    //2.operator += a= a+..
    a += 10;
    System.out.println("\n2. setelah a += 10 (a = a + 10)");
    System.out.println("a = " + a);

    //3.operator -= a = a - ..
    a -= 15;
    System.out.println("\n3. setelah a -= 15 (a = a - 15)");
    System.out.println("a = " + a);

    //4.operator *= a = a * ...
    a *= 2;
    System.out.println("\n4. setelah a *= 2 (a * 2)");
    System.out.println("a = " + a);

    //5.operator  /= a = a /..
    a /= 3;
    System.out.println("\n5. setelah a /= 3 (a = a / 3)");
    System.out.println("a = " + a);

    //6.operator %= sisa bagi (modulus)
    a %= 3;
    System.out.println("\n6. setelah a %= 3 (a = a % 3)");
    System.out.println("a = " + a);
    
    }
    
}
