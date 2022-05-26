public class PythagorasTheorem {
    public static void main(String[] args) {
        double tapak = 3;
        System.out.println("Nilai tapak segi tiga ialah 3");
        double tinggi = 4;
        System.out.println("Nilai tinggi segi tiga ialah 4");
        double hypotenuse = Math.sqrt((tapak*tapak) + (tinggi*tinggi));    
        System.out.println("Hypotenuse segi tiga ialah " + Math.round(hypotenuse)+"cm.") ;
    }
}