package ex4;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer in ]0;1000[: ");
        int number = scanner.nextInt();
        int digit = number % 10;
        int sum = digit;

        number = number / 10;
        digit = number % 10;
        sum = sum + digit;

        number = number / 10;
        digit = number % 10; // overflødig, hvis number kun har et ciffer
        sum = sum + digit;

        System.out.println("The sum of the digits is " + sum);
    }
}
