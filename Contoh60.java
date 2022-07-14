public class Contoh60 {
    public static void main(String[] args){
        String [] senaraiNama = new String[4];
        senaraiNama[0] = "Adam";
        senaraiNama[1] = "Alia";
        senaraiNama[2] = "Wong";
        senaraiNama[3] = "Devi";
         
        int [] senaraiUmur = {16, 17, 16, 17};
         
        double [] senaraiTinggi = {182.1,172.5,173.2,175.0};
        System.out.println("NAMA\tUMUR\tTINGGI(cm)");
        for(int i=0;i<4;i++) {
            System.out.print(senaraiNama[i] + "\t");
            System.out.print(senaraiUmur[i] + "\t");
            System.out.print(senaraiTinggi[i]);
            System.out.println();
        }
    }
}