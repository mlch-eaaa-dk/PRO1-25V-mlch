package ex4;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The uniform triangular prism's length of sides:");
        double length = scanner.nextDouble();
        double area = Math.sqrt(3) / 4.0 * Math.pow(length, 2.0);
        double volume = area * length;
        System.out.println("Area of equilateral base is " + area);
        System.out.println("Volume is " + volume);
    }
}
