public class MathUtils {

    public static int pgcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        int resultat = pgcd(42, 30);
        System.out.println("PGCD : " + resultat);
    }
}