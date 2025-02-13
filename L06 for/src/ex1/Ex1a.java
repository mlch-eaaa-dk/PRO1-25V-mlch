package ex1;

public class Ex1a {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum = sum + i;
        }
        System.out.println("Sum of even numbers in 1..100 is " + sum);
    }
}
