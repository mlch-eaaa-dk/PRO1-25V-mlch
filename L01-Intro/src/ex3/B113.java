package ex3;

public class B113 {
    public static void main(String[] args) {
        System.out.println("x = " + (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1));
        System.out.println("y = " + (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));
        System.out.println();


        // pre: a*d - b*f != 0
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        System.out.println(a + " * x + " + b + " * y = " + e);
        System.out.println(c + " * x + " + d + " * y = " + f);

        if (a * d - b * c == 0) {
            System.out.println("ingen løsning");
            return;
        }

        System.out.println("x = " + (e * d - b * f) / (a * d - b * c));
        System.out.println("y = " + (a * f - e * c) / (a * d - b * c));
        System.out.println();

        a = 5.7;
        b = 7.2;
        c= 11.4;
        d= 14.4;
        e = 2.6;
        f = 5.2;

        System.out.println(a + " * x + " + b + " * y = " + e);
        System.out.println(c + " * x + " + d + " * y = " + f);

        if (a * d - b * c == 0) {
            System.out.println("ingen løsning");
            return;
        }

        System.out.println("x = " + (e * d - b * f) / (a * d - b * c));
        System.out.println("y = " + (a * f - e * c) / (a * d - b * c));
    }
}
