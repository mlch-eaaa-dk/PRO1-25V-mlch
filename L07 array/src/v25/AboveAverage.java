package v25;

import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        // Make a program that inputs 10 numbers,
        // calculates the average,
        // and prints the numbers bigger than the average.

        Scanner scanner = new Scanner(System.in);

        // make an array that can contain 10 integer numbers
        int[] numbers = new int[10];

        System.out.println("Skriv 10 heltal:");
        // read the numbers
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // calculate the average
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += numbers[i];
        }
        double average = sum/10.0;
        System.out.println("average = " + average);

        // prints the numbers bigger than the average
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > average) {
                System.out.println(numbers[i]);
            }
        }
    }
}
