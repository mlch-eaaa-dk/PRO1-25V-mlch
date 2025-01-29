package ex3;

import java.util.Scanner;

public class Ex3Extended {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 <= number2 && number2 <= number3) {
            System.out.println(number1 + " " + number2 + " " + number3);
        }
        if (number1 <= number3 && number3 <= number2) {
            System.out.println(number1 + " " + number3 + " " + number2);
        }
        if (number2 <= number1 && number1 <= number3) {
            System.out.println(number2 + " " + number1 + " " + number3);
        }
        if (number2 <= number3 && number3 <= number1) {
            System.out.println(number2 + " " + number3 + " " + number1);
        }
        if (number3 <= number1 && number1 <= number2) {
            System.out.println(number3 + " " + number1 + " " + number2);
        }
        if (number3 <= number2 && number2 <= number1) {
            System.out.println(number3 + " " + number2 + " " + number1);
        }
    }
}
