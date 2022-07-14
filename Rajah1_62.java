import java.util.Scanner;

public class Rajah1_62 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        mintaNama();
        mintaMarkah();
    }
    public static void mintaNama() {
        String nama;
        System.out.println("Masukkan nama:");
        nama = scanner.nextLine();
        System.out.println("Terima kasih " + nama);
    }
    public static void mintaMarkah() {
        int markah;
        System.out.println("Masukkan markah: ");
        markah = scanner.nextInt();
        System.out.println("Markah anda: " + markah);
    }
}