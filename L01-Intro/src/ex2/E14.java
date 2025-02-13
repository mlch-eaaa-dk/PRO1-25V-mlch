package ex2;

public class E14 {
    public static void main(String[] args) {
        int amount = 5000;
        double multiplier = 1.05;
        int yearCount = 0;
        System.out.println("year   balance");
        System.out.printf("  %d    $ %12.2f\n", yearCount, amount * 1.0);
        yearCount = yearCount + 1;
        System.out.printf("  %d    $ %12.2f\n", yearCount, amount * multiplier);
        yearCount = yearCount + 1;
        System.out.printf("  %d    $ %12.2f\n", yearCount, amount * multiplier * multiplier);
        yearCount = yearCount + 1;
        System.out.printf("  %d    $ %12.2f\n", yearCount, amount * multiplier * multiplier * multiplier);
        yearCount = 30;
        System.out.printf("  %d   $ %12.2f kr\n", yearCount, amount * Math.pow(multiplier, yearCount));
        amount = 1000;
        System.out.printf("  %d   $ %12.2f kr\n", yearCount, amount * Math.pow(multiplier, yearCount));
    }
}
