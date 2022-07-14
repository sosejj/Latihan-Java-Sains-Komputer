import java.util.Scanner;
public class Calculator {

    static String oper;
    static double no1,no2,jawapan;
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            paparMesej();
            dapatInput();
            pengiraan();
            paparOutput();
        }
    }
    
    static void paparMesej() {
        System.out.println("\nKalkulator\n\nSila masukkan operasi matematik (char type) yang hendak dilakukan:\n1. Tambah (+)\n2. Tolak (-)\n3. Darab (*)\n4. Bahagi (/)\n");
    }

    static void dapatInput() {
        oper = input.next();
        System.out.println("\nSila masukkan dua nombor yang hendak digunakan (dalam urutan yang betul, dipisahkan dengan SPACE):\n");
        no1 = input.nextDouble();
        no2 = input.nextDouble();
    }

    static void pengiraan() {
        if (oper.equals("+")) {
            jawapan = (no1 + no2);
        } else if (oper.equals("-")) {
            jawapan = (no1 - no2);
        } else if (oper.equals("*")) {
            jawapan = (no1 * no2);
        } else {
            jawapan = (no1 / no2);
        }
    }
    
    static void paparOutput() {
        System.out.println("\nJawapan: " + no1 + " " + oper + " " + no2 + " = " + jawapan + "\n");
    }
}