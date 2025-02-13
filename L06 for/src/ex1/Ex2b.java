package ex1;

import java.util.Scanner;

public class Ex2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lower and upper limit:");
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();

        int sum = sumEvenInts(lower, upper);
        System.out.println("Sum of even numbers in " +
                lower + ".." + upper + " is " + sum);
    }

    public static int sumEvenInts(int lower, int upper) {
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
