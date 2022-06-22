import java.util.Scanner;

public class Contoh41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nom = sc.nextInt();
        while (nom > 0) {
            nom -= 1;
            System.out.println(nom + " ");
        }
        sc.close();
    }
}