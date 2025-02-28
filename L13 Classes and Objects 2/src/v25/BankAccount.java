package v25;

public class BankAccount {
    private final int id;
    private String ownerName;
    private double balance; // DKR

    private static int nextId = 100;

    public BankAccount(String name) {
       this(name, 0);
    }

    public BankAccount(String ownerName, double balance) {
        this.id = nextId;
        nextId++;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("BankAccount(%d, %s, %.0f kr)",
                this.id, this.ownerName, this.balance);
    }

    // Add amount to balance.
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Subtract amount from balance.
    public void withDraw(double amount) {
        this.balance -= amount;
    }

    public static int getNextId() {
        return BankAccount.nextId;
    }
}
