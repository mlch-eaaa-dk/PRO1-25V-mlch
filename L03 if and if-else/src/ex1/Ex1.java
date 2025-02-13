package ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv et heltal:");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("negativ");
        } else if (number == 0) {
            System.out.println("0");
        } else {
            System.out.println("positiv");
        }
    }
}
