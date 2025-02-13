package v25;


import java.util.Scanner;

/*
 Input 3 numbers,
 calculate and print the average of the numbers.
 */
public class ComputeAverage {
    public static void main(String[] args) {
        // Algorithm:
        // Prompt the user for 3 integers
        // Read the 3 integers
        // Calculate average
        // Print average

        System.out.println("Write 3 integers:");
        Scanner scan = new Scanner(System.in);
        int integer1 = scan.nextInt();
        int integer2 = scan.nextInt();
        int integer3 = scan.nextInt();
        double average = (integer1 + integer2 + integer3) / 3.0;
        System.out.println("average = " + average);
    }
}
