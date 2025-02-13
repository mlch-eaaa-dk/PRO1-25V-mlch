package ex1;

import java.util.Scanner;

/*
 Input purchased amount,
 calculate nad print sales tax (6%).
 */
public class SalesTax {
    public static void main(String[] args) {
        // Algorithm:
        // Prompt user for purchased amount
        // Read purchased amount
        // Compute sales tax (6% of amount)
        // Print sales tax

        Scanner scanner = new Scanner(System.in);
        final int taxPct = 6;

        System.out.print("Purchased amount: ");
        double amount = scanner.nextDouble();
        double tax = amount * taxPct / 100;
        System.out.println("Sales tax is " + tax);
        System.out.printf("Sales tax is %.2f", tax);
    }
}
