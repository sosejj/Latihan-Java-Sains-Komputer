import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Sila masukkan nama anda:");
        String nama = input.next();

        System.out.println("Sila masukkan umur anda:");
        int umur = input.nextInt();

        System.out.println("Sila masukkan nombor kegemaran anda (integer sahaja):");
        int nombor_kegemaran = input.nextInt();
        
        System.out.println("Adakah anda suka membaca? (masukkan suka atau tidak suka):");
        String baca_buku = input.next();
        input.close();
        System.out.println("Nama saya ialah " + nama +".\nSaya berumur " + umur + " tahun.\nSaya suka akan nombor " + nombor_kegemaran + ".\nSaya " + baca_buku + " baca buku.");
    }
}
