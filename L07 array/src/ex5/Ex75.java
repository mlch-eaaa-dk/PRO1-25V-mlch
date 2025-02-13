package ex5;

import java.util.Scanner;

public class Ex75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for  (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 != 0) evenCount++;
            else oddCount++;
        }

        System.out.println("The count of odd numbers: " + evenCount);
        System.out.println("The count of even numbers: " + oddCount);
    }
}
