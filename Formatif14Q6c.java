import java.util.Scanner;

public class Formatif14Q6c {
    public static void main(String[] args) {
        int ctr = 0;
        String strPassword = new String();
        Scanner sc = new Scanner(System.in);
        final String RekodLaluanRahsia = "Pisang";
        while (!strPassword.equals(RekodLaluanRahsia) && ctr < 3) {
            System.out.println("Sila masukkan password: ");
            strPassword = sc.next();
            System.out.println();
            ctr++;
        }
        System.out.println("Minta maaf, kamu sudah gagal 3 kali.");
        sc.close();
    }
}