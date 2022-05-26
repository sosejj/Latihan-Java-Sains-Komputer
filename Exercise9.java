import java.util.Scanner; // Added semicolon
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); // Added Scanner
        System.out.println("Sila masukkan berat 1:");
        int berat1 = input.nextInt();

        System.out.println("Sila masukkan berat 2:");
        int berat2 = input.nextInt();

        System.out.println("Sila masukkan berat 3:"); // Added quotes ""
        int berat3 = input.nextInt();

        double purata = (berat1+berat2+berat3)/3; // Changed variable type to double, changed * to / to calculate mean
        input.close();
        System.out.println("Purata berat ialah: "+purata);
    }
}