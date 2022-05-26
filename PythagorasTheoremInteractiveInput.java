import java.util.Scanner;
public class PythagorasTheoremInteractiveInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sila masukkan nilai tapak segi tiga:");
        double tapak = input.nextDouble();
        System.out.println("Sila masukkan nilai tinggi segi tiga:");
        double tinggi = input.nextDouble();
        double hypotenuse = Math.sqrt((tapak*tapak) + (tinggi*tinggi));    
        System.out.println("Hypotenuse segi tiga ialah " + Math.round(hypotenuse)+"cm.") ;
        input.close();
    }
}