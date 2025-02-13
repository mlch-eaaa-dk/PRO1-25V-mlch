package ex5;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        // Generate a random lottery number (in 10..99)
        // (as test, not in the finished program: Print the lottery number)
        // Prompt the user for a guess of the lottery number
        // Read the guess
        // if (guess == lottery number)
        //     Print YOU WIN $10.000
        // else if guess has the same digits as lottery number (in reversed order)
        //     Print YOU WIN $3.000
        // else if guess has one of the digits in lottery number
        //     Print YOU WIN $1.000
        // else
        //     Print SORRY, YOU LOOSE

        int lotteryNumber = (int) (Math.random() * 90) + 10; // 10..99
        System.out.println("Lottery number is " + lotteryNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your guess (in 10..99): ");
        int guess = scanner.nextInt();

        if (guess == lotteryNumber) {
            System.out.println("Exact match: YOU WIN $10.000");
        } else {
            int guessDigit1 = guess / 10;
            int guessDigit2 = guess % 10;
            int lotteryNumberDigit1 = lotteryNumber / 10;
            int lotteryNumberDigit2 = lotteryNumber % 10;

            if (guessDigit1 == lotteryNumberDigit2 && guessDigit2 == lotteryNumberDigit1) {
                System.out.println("Both digits match: YOU WIN $3.000");
            } else if (guessDigit1 == lotteryNumberDigit1 ||
                    guessDigit1 == lotteryNumberDigit2 ||
                    guessDigit2 == lotteryNumberDigit1 ||
                    guessDigit2 == lotteryNumberDigit2) {
                System.out.println("One digit match: YOU WIN $1.000");
            } else {
                System.out.println("No match: SORRY, YOU LOOSE");
            }
        }
    }
}
