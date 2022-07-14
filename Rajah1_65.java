public class Rajah1_65 {
    
    static java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    public static void main(String[] args){
        String nama, alamat, telefon;
        
        nama = getNama();
        alamat = getAlamat(nama);
        telefon = getTelefon(nama);
        
        System.out.println();
        System.out.println("Terima kasih. Sila semak.");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Telefon: " + telefon);
    }
    
    static String getNama(){
        System.out.print("Masukkan nama: ");
        return scanner.nextLine();
    }
    
    static String getAlamat(String n){
        System.out.print(n + ", sila masukkan alamat: ");
        return scanner.nextLine();
    }
    
    static String getTelefon(String n){
        System.out.print(n + ", sila masukkan telefon: ");
        return scanner.nextLine();
    }
}
