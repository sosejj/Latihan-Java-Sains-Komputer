import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        char oper;
        double no1,no2;
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator ShiYang\nSila masukkan operasi matematik (char type) yang hendak dilakukan:\n1. Tambah (+)\n2. Tolak (-)\n3. Darab (*)\n4. Bahagi (/)\n");
        oper = input.next().charAt(0);
        System.out.println("\nSila masukkan dua nombor yang hendak digunakan (dalam urutan yang betul, dipisahkan dengan SPACE):\n");
        no1 = input.nextDouble();
        no2 = input.nextDouble();
        if (oper == '+') {
            System.out.println("\nJawapan: "+ no1+ " + "+ no2+ " = "+ (no1 + no2));
        } else if (oper == '-') {
            System.out.println("\nJawapan: "+ no1+ " - "+ no2+ " = "+ (no1 - no2));
        } else if (oper == '*') {
            System.out.println("\nJawapan: "+ no1+ " * "+ no2+ " = "+ (no1 * no2));
        } else if (oper == '/') {
            System.out.println("\nJawapan: "+ no1+ " / "+ no2+ " = "+ (no1 / no2));
        }
        input.close();
    }
}