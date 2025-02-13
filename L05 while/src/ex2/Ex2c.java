package ex2;

import java.util.Scanner;

public class Ex2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        int sum = sumOddDigits(number);
        System.out.println("Sum of odd digits in " + number + " is " + sum);
    }

    public static int sumOddDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number = number / 10;
        }
        return sum;
    }

}
