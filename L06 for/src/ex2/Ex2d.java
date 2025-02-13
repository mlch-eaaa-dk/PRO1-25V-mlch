package ex2;

import java.util.Scanner;

public class Ex2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Antal tal:");
        int numbersCount = scanner.nextInt();
        System.out.println("Indtast " + numbersCount + " tal i området 1..99:");

        int lastRead = 0;
        int count = 1;
        for (int i = 0; i < numbersCount; i++) {
            int number = scanner.nextInt();
            if (number == lastRead) {
                count++;
            } else {
                if (count > 1) System.out.print(lastRead + " ");
                lastRead = number;
                count = 1;
            }
        }
        if (count > 1) {
            System.out.print(lastRead + " ");
        }
    }
}
