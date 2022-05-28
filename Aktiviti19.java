import java.util.Scanner;
public class Aktiviti19 {
    public static void output(int markah, String Gred) {
        System.out.println("Markah ialah "+markah+" dan Gred ialah "+Gred);
    }
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println ("Masukkan markah di antara 1 hingga 100: ");
        int markah = (int) input.nextDouble();
        switch ((90 <= markah && markah <= 100) ? 1 :
        (80 <= markah && markah <= 89) ? 2 :
        (75 <= markah && markah <= 79) ? 3 :
        (70 <= markah && markah <= 74) ? 4 :
        (65 <= markah && markah <= 69) ? 5 :
        (60 <= markah && markah <= 64) ? 6 :
        (50 <= markah && markah <= 59) ? 7 :
        (45 <= markah && markah <= 49) ? 8 :
        (40 <= markah && markah <= 44) ? 9 :
        (0 <= markah && markah <= 39) ? 10 : 11) 
        {
            case 1: {
                System.out.println("Markah anda ialah " + markah + ", gred 'A+'");
                break;
            } case 2: {
                System.out.println("Markah anda ialah " + markah + ", gred 'A'");
                break;
            } case 3: {
                System.out.println("Markah anda ialah " + markah + ", gred 'A-'");
                break;
            } case 4: {
                System.out.println("Markah anda ialah " + markah + ", gred 'B+'");
                break;
            } case 5: {
                System.out.println("Markah anda ialah " + markah + ", gred 'B'");
                break;
            } case 6: {
                System.out.println("Markah anda ialah " + markah + ", gred 'C+'");
                break;
            } case 7: {
                System.out.println("Markah anda ialah " + markah + ", gred 'C'");
                break;
            } case 8: {
                System.out.println("Markah anda ialah " + markah + ", gred 'D'");
                break;
            } case 9: {
                System.out.println("Markah anda ialah " + markah + ", gred 'E'");
                break;
            } case 10: {
                System.out.println ("Markah anda ialah " + markah + ", gred 'G'");
                break;
            } default: {
                System.out.println("Nombor yang dimasukkan bukan di antara 0 hingga 100");
            }
        }
        input.close();
    }
}