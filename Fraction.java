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
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(1, 6);
        Fraction somme = f1.add(f2);
        Fraction multiplication = f1.multiplication(f2);
        System.out.println(f1.toString()); 
        System.out.println("La somme donne : " + somme);
        System.out.println("Le produit donne :" + multiplication);
        System.out.println("Décimal : " + f1.toDouble());
    }

    public String toString() {
        return num + " / " + deno;
    }

    public Fraction add(Fraction other) {
        int MajNum = this.num * other.deno + this.deno * other.num;
        int MajDeno = this.deno * other.deno;
        return new Fraction(MajNum, MajDeno);
    }

    public Fraction multiplication(Fraction other) {
        int MajNum = this.num * other.num;
        int MajDeno = this.deno * other.deno;
        return new Fraction(MajNum, MajDeno);

    }

    public double toDouble() {
        return (double) this.num / this.deno;
    }
}