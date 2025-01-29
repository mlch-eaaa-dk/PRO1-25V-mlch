package bookchap2;

import java.util.Scanner;

/*
 Input loan amount, annual interest rate and number of years,
 calculate and print the monthly payment and the total payment.

 Monthly payment = loan amount * interest rate / denominator,
 where denominator = 1 - 1 / (1 + interest rate pr month) ^ number of months).

 Use Math.pow(a, b) to calculate a ^ b (example: 2 ^ 3 = 8).
 */
public class ComputeLoan {
    public static void main(String[] args) {
        // Algorithm:
        // Prompt user for loan amount
        // Read loan amount
        // Prompt user for yearly interest rate in %
        // Read yearly interest rate
        // Prompt user for number of years
        // Read number of years
        // Compute monthly payment
        // Display monthly payment
        // Compute total payment
        // Display total payment

        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan amount in $: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Number of years: ");
        int numberOfYears = scanner.nextInt();
        System.out.print("Yearly Interest rate in %: ");
        double yearlyInterestRatePct = scanner.nextDouble();
        System.out.println();

        double monthlyInterestRate = yearlyInterestRatePct / 100 / 12;
        int numberOfMonths = numberOfYears * 12;
        double denominator = 1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfMonths);
        double monthlyPayment = loanAmount * monthlyInterestRate / denominator;
        System.out.printf("Monthly payment is %.2f\n", monthlyPayment);
        double totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.printf("Total payment is %.2f\n", totalPayment);
    }
}
