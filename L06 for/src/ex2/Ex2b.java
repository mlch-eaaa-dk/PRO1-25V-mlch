package ex2;

import java.util.Scanner;

public class Ex2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Antal tal:");
        int numbersCount = scanner.nextInt();
        System.out.println("Indtast " + numbersCount + " tal i området 1..99:");

        int total = 0;
        for (int i = 0; i < numbersCount; i++) {
            int number = scanner.nextInt();
            total += number;
            System.out.println("Akkumuleret total: " + total);
        }
    }
}
