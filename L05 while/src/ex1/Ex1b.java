package ex1;

import java.util.Scanner;

public class Ex1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter upper limit: ");
        int limit = scanner.nextInt();

        int sum = 0;
        int i = 1;
        while (i * i <= limit) {
            sum = sum + i * i;
            i++;
        }

        System.out.println("Sum of square numbers in 1.." + limit + " is " + sum);
    }
}
