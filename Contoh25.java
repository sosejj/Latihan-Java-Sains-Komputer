import java.util.Scanner;
public class Contoh25 {
    public static void main(String[] args) {
        System.out.println("Sila input markah anda:");
        Scanner input = new Scanner(System.in);
        double markah = input.nextDouble();
        input.close();
        String Gred = null;
        if (markah >= 90) {
            Gred = "A+";
        } else if (markah >= 80 ) {
            Gred = "A";
        } else if (markah >= 75 ) {
            Gred = "A-";
        } else if (markah >= 70 ) {
            Gred = "B+";
        } else if (markah >= 65 ) {
            Gred = "B";
        } else if (markah >= 60 ) {
            Gred = "C+";
        } else if (markah >= 50 ) {
            Gred = "C";
        } else if (markah >= 45 ) {
            Gred = "D";
        } else if (markah >= 40 ) {
            Gred = "E";
        } else if (markah >= 0 ) {
            Gred = "G";
        }
        System.out.println("Markah = "+markah+" dan Gred ialah "+Gred);
    }
}
