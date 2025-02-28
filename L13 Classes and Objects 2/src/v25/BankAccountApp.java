package v25;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Jens");
        System.out.println(acc1);

        acc1.deposit(1000);
        acc1.withDraw(300);
        acc1.withDraw(400);
        System.out.println(acc1);
        System.out.println();

        BankAccount acc2 = new BankAccount("Hans", 20000);
        System.out.println(acc2);

        acc2.withDraw(2000);
        System.out.println(acc2);
        System.out.println();

        System.out.println("nextId = "+ BankAccount.getNextId());
    }
}
