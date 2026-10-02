public class day31 {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        System.out.printf("Nilai a = %b\n", a);
        System.out.printf("Nilai b = %b\n\n", b);

        // 1. OPERATOR AND (&&)
        System.out.println("=== AND (&&) ===");
        System.out.printf("true && true   = %b\n", true && true);
        System.out.printf("true && false  = %b\n", true && false);
        System.out.printf("false && true  = %b\n", false && true);
        System.out.printf("false && false = %b\n", false && false);
        System.out.printf("a && b = %b\n\n", a && b);

        // 2. OPERATOR OR (||)
        System.out.println("=== OR (||) ===");
        System.out.printf("true || true   = %b\n", true || true);
        System.out.printf("true || false  = %b\n", true || false);
        System.out.printf("false || true  = %b\n", false || true);
        System.out.printf("false || false = %b\n", false || false);
        System.out.printf("a || b = %b\n\n", a || b);

        // 3. OPERATOR NOT (!)
        System.out.println("=== NOT (!) ===");
        System.out.printf("!true  = %b\n", !true);
        System.out.printf("!false = %b\n", !false);
        System.out.printf("!a = %b\n", !a);
        System.out.printf("!b = %b\n\n", !b);


    }
}
