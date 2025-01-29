package bookchap2;

import java.util.Scanner;

/*
Input 3 numbers,
calculate and print the average of the 3 numbers.
*/
public class ComputeAverage {
    public static void main(String[] args) {
        // Algorithm:
        // Prompt user for 3 numbers
        // Read the numbers
        // Compute average
        // Print average

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        double average = (number1 + number2 + number3) / 3;
        System.out.println("Average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
}
