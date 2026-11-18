import java.util.Scanner;
public class day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Buat Username : ");
        String username = input.nextLine();

        System.out.print("Buat Password : ");
        String password = input.nextLine();

        System.out.println("\nAkun berhasil dibuat!");
        System.out.println("Silakan login ke akun Anda.");

        boolean loginBerhasil = false;
        while (!loginBerhasil) {
            System.out.print("Masukkan Username : ");
            String usernameLogin = input.nextLine();
            System.out.print("Masukkan Password : ");
            String passwordLogin = input.nextLine();

            if (usernameLogin.equals(username)
                    && passwordLogin.equals(password)) {

                loginBerhasil = true;
              
                System.out.println("       LOGIN BERHASIL!");
                System.out.println("Selamat datang, " + username + "!");

            } else {

                System.out.println("\nUsername atau password salah!");
                System.out.println("Silakan coba login kembali.");
            }
        }

        input.close();
    }
  }
