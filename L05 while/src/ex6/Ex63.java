package ex6;

import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        System.out.println("Type an integer:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int reversed = reverse(number);
        System.out.println("reversed = " + reversed);

        boolean isPalindromeNumber = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? "  + isPalindromeNumber);
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
