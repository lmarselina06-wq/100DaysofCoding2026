public class Pola {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print((i + j) % 2 == 0 ? "# " : "0 ");
            }
            System.out.println();
        }

    }
  }
