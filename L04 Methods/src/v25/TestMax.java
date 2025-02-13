package v25;

import java.util.Scanner;

public class TestMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read two integers
//        System.out.println("Skriv to heltal:");
//        int number1 = scanner.nextInt();
//        int number2  = scanner.nextInt();

        // calculate the biggest number
        int number1 = 50;
        int number2 = 100;
        int result = max(number1, number2);
        // print the biggest number
        System.out.println("The maximum between " + number1 + " and " + number2 + " is " + result);

        // calculate the biggest number
        number1 = 67;
        number2 = 33;
        result = max(number1, number2);
        // print the biggest number
        System.out.println("The maximum between " + number1 + " and " + number2 + " is " + result);

        // calculate the biggest number
        number1 = 34;
        number2 = 87;
        result = max(number1, number2);
        // print the biggest number
        System.out.println("The maximum between " + number1 + " and " + number2 + " is " + result);
    }

    // calculate the biggest number
    public static int max(int num1, int num2) {
        int result = num1;
        if (num2 > num1) {
            result = num2;
        }
        return result;
    }
}
