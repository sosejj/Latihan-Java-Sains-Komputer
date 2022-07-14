public class Rajah1_67 {
    static String nama;
    static int markah;
    static String gred;
    static java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    public static void main(String[] args){
        
        getNama();
        getMarkah();
        setGred();
        paparInfo();
    }
    static void getNama(){
        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();
    }
    
    static void getMarkah(){
        System.out.print("Masukkan markah, " + nama + ": ");
        markah = scanner.nextInt();
    }
    
    static void setGred(){
        if(markah>=90){gred = "A+";}
        else if (markah>=80){gred = "A";}
        else if (markah>=75){gred = "A-";}
        else if (markah>=70){gred = "B+";}
        else if (markah>=65){gred = "B";}
        else if (markah>=60){gred = "C+";}
        else if (markah>=50){gred = "C";}
        else if (markah>=45){gred = "D";}
        else if (markah>=40){gred = "E";}
        else {gred="F";}
    }
    
    static void paparInfo(){
        System.out.print("Terima kasih, " + nama + ". ");
        System.out.println("Gred untuk " + markah + " adalah " + gred);
    }
}
