package ex4;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solve quadratic equation a*x^2 + b*x + c = 0");
        System.out.println("Enter a, b and c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;
        double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);

        if (d > 0) {
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        }
        if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("The equation has one root: " + r);
        }
        if (d < 0) {
            System.out.println("The equation has no real roots.");
        }
    }
}
