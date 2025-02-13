package ex2;

public class Ex2a {
    public static void main(String[] args) {
        printPowersOfTwo();
    }

    public static void printPowersOfTwo() {
        int power = 1;
        int i = 0;
        while (i <= 20) {
            System.out.printf("2^%d = %,d\n", i, power);
            power = power * 2;
            i++;
        }
    }
}
