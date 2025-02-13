package ex2;

import java.util.Scanner;

public class Ex2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Antal tal:");
        int numbersCount = scanner.nextInt();
        System.out.println("Indtast " + numbersCount + " tal i området 1..99:");

        int max = 0;
        int count = 0;
        for (int i = 0; i < numbersCount; i++) {
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Det største tal er " + max);
        System.out.println("Antal gange det største tal forekommer er " + count);
    }
}
