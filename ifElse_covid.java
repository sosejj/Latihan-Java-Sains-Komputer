import java.util.Scanner;
public class ifElse_covid {
    public static void main(String[] args) {
        System.out.println("Sila input umur anda:");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age <= 5) {
            System.out.println("Anda tidak layak mendapat suntikan vaksin Covid-19.");
        } else if (age <= 17) {
            System.out.println("Adakah ibu bapa anda bersetuju untuk kamu mendapat suntikan vaksin Covid-19? Sila jawab dengan 'ya' atau 'tidak'.");
            String decision = input.next();
            input.close();
            if (decision.equals("ya")) {
                age = 18;
            } else if (decision.equals("tidak")) {
                System.out.println("Anda tidak layak mendapat suntikan vaksin Covid-19.");
            }
        } 
        if (age <= 18) {
            System.out.println("Anda layak mendapat suntikan vaksin Covid-19.");
        }
        input.close();
    }
}
