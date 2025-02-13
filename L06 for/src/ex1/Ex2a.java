package ex1;

public class Ex2a {
    public static void main(String[] args) {
        printPowersOfTwo();
    }

    public static void printPowersOfTwo() {
        int power = 1;
        for (int i = 0; i <= 20; i++) {
            System.out.printf("2^%d = %,d\n", i, power);
            power = power * 2;
        }
    }

}
