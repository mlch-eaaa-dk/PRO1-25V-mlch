package ex3;

import java.util.Scanner;

public class Ex3a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 <= number2) {
            System.out.println(number1 + " " + number2);
        } else {
            System.out.println(number2 + " " + number1);
        }
    }
}
