package v25;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 100) + 1;
        System.out.println("SECRET random number is : " + number);
        System.out.println();

        System.out.println("Guess a number in 1..100");

        int guess = -1;
        while(guess != number) {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("You guessed it! The number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too HIGH");
            } else {
                System.out.println("Your guess is too LOW");
            }
        }
    }

}
