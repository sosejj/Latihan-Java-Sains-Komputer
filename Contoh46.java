import java.util.Scanner;

public class Contoh46 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            for (i = 0; i <= 20; i++) {
                System.out.println((int)(Math.random()*6)+1 + " ");
            }
            System.out.println("\n--------------------");
            System.out.println("Taip ya untuk teruskan. Tidak untuk henti");
            if (sc.next().equals("ya")) {
                flag = true;
            } else {
                flag = false;
            }
        } while (flag);
    }    
}
