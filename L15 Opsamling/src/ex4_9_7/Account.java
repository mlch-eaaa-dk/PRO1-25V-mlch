package ex4_9_7;

import java.time.LocalDate;

public class Account {
    private int id;
    private double balance; // $
    private double annualInterestRate; // %
    private LocalDate dateCreated;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = LocalDate.now();
    }

    public Account() {
        this(0, 0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Denne metode er IKKE en GETTER!
    public double getMonthlyInterest() {
        return balance * this.getMonthlyInterestRate() / 100;
    }

    public void withDraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
