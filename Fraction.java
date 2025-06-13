public class Fraction {
    private final int num;
    private final int deno;

    public Fraction(int num, int deno) {
        if (deno == 0) {
            throw new IllegalArgumentException("Erreur dnominateur");
        }

        int pgcd = pgcd(Math.abs(num), Math.abs(deno));
        num /= pgcd;
        deno /= pgcd;

        if (deno < 0) {
            num = -num;
            deno = -deno;
        }
        this.num = num;
        this.deno = deno;
    }

    private static int pgcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 9);
        System.out.println(f1.toString()); 
    }

    public String toString() {
        return num + " / " + deno;
    }
}