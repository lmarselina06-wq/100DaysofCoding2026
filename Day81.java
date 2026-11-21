import java.util.Scanner;

public class day81 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int[] angka = new int[5];

for (int i = 0; i < angka.length; i++) {
System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
angka[i] = input.nextInt();
}
for (int i = 0; i < angka.length; i++) {
System.out.println("angka[" + i + "] = " + angka[i]);
}

input.close();
}
}
