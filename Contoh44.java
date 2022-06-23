import java.util.Scanner;
public class Contoh44 {
    public static void main(String[] args) {
        double no;
        double sum = 0;
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        do {
            no = sc.nextDouble();
            sum += no;
            counter += 1;
        } while (counter <= 5);
        System.out.println("The total is " + sum);
        sc.close();
    }
}
