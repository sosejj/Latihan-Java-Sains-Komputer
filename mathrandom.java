public class mathrandom {
    public static void main(String[] args) {
        int value = 0;
        for (int i = 1; i <= 20; i++) {
            value = (int)(Math.random()*(6+1));
            System.out.println(value);
        }
    }
}
