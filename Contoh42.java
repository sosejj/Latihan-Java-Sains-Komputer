import java.util.Scanner;

public class Contoh42 {
    public static void main(String[] args) {
        String strPassword = new String();
        Scanner sc = new Scanner(System.in);
        final String RekodLaluanRahsia = "Pisang";
        while (!strPassword.equals(RekodLaluanRahsia)) {
            System.out.println("Sila masukkan password: ");
            strPassword = sc.next();
            System.out.println();
        }
        sc.close();
    }
}
