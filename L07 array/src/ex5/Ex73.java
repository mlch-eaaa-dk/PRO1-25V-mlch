package ex5;

import java.util.Scanner;

public class Ex73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] frequency = new int[51]; // index 0 is not used

        System.out.println("Enter some integers in 1 to 50, end with 0:");
        int number = scanner.nextInt();
        while (number != 0 ) {
            if (number < 1 || number > 50) {
                System.out.println("Error: " +number + " is not in 1..50");
            } else {
                frequency[number]++;
            }
            number = scanner.nextInt();
        }

        for (int i = 1; i <= 50; i++) {
            if (frequency[i] > 0) {
                System.out.printf("%2d occurs %2d ", i, frequency[i]);
                if (frequency[i] == 1) System.out.println("time");
                else System.out.println("times");
            }
        }
    }
}
