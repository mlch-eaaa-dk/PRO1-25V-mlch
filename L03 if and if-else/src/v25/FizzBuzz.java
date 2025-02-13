package v25;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Read a positive integer number.
        // Print “Fizz” if the number is divisible by 3,
        // print “Buzz” if the number is divisible by 5,
        // print “FizzBuzz” if the number is divisible by both 3 and 5,
        // otherwise just print the number.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        boolean divBy3 = number % 3 == 0;
        boolean divBy5 = number % 5 == 0;

        if (divBy3 && divBy5) {
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("The number is " + number);
        }


    }
}
