package ex2;

import java.util.Scanner;

public class Ex2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Antal tal:");
        int numbersCount = scanner.nextInt();
        System.out.println("Indtast " + numbersCount + " tal i området 1..99:");

        int min = 100;
        int max = 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbersCount; i++) {
            int number = scanner.nextInt();
            if (number < min) min = number;
            if (number > max) max = number;
            if (number % 2 == 0) evenCount++;
            if (number % 2 != 0) oddCount++;
        }

        System.out.println("Min er " + min);
        System.out.println("Max er " + max);
        System.out.println("Antal lige tal er " + evenCount);
        System.out.println("Antal ulige tal er " + oddCount);
    }
}
