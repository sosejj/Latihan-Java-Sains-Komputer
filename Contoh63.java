public class Contoh63 {
    public static void main(String[] args) {
        int[] senaraiNombor = {1,2,3,4,5,6,7,8,9,10};
        paparSenarai(senaraiNombor);
    }

    static void paparSenarai(int[] senaraiNombor){
        System.out.print("Senarai nombor dalam subatur cara: ");
        for (int i = 0; i < senaraiNombor.length; i++) {
            System.out.print(senaraiNombor[i] + ",");
        }
    }
}
