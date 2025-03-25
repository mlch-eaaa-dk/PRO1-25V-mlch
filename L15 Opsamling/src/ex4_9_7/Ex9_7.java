package ex4_9_7;

public class Ex9_7 {
    public static void main(String[] args) {
        Account acc1 = new Account(1122, 20000);
        acc1.setAnnualInterestRate(4.5);

        acc1.withDraw(2500);
        acc1.deposit(3000);

        System.out.printf("Balance = %.2f\n", acc1.getBalance());
        System.out.printf("Monthly interest = $%.2f\n", acc1.getMonthlyInterest());
        System.out.println("Account created " + acc1.getDateCreated());
    }
}
