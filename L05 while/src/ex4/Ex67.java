package ex4;

import java.util.Scanner;

public class Ex67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.print("Investment amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Yearly interest rate in %: ");
        double yearlyInterestRate = scanner.nextDouble();

        System.out.println("Years   Future Value");
        int year = 1;
        while (year <= 30) {
            double futureValue = futureInvestmentValue(amount, yearlyInterestRate / 100 / 12, year);
            System.out.printf("%2d %15.2f\n", year, futureValue);
            year++;
        }
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int year) {
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, year * 12);
        return futureValue;
    }
}
