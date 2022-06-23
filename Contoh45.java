import java.util.Scanner;
public class Contoh45 {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        int no1, no2;
        do {
            no1 = sc.nextInt();
            no2 = sc.nextInt();
            System.out.println("Beza: " + Math.abs(no2 - no1));
            System.out.println("Taip Ya untuk teruskan ..");
            input = sc.next();
        } while (input.equals("Ya"));
        sc.close();
    }
}
