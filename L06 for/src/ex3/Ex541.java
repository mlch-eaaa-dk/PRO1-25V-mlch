package ex3;

import java.util.Scanner;

public class Ex541 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast nogle tal i området 1..99, slut med 0:");

        int max = 0;
        int count = 0;
        int number = scanner.nextInt();
        do {
            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
            number = scanner.nextInt();
        } while (number != 0);
        System.out.println();
        System.out.println("Det største tal er " + max);
        System.out.println("Antal gange det største tal forekommer er " + count);
    }
}
