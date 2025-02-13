package ex1;

public class Ex1a {
    public static void main(String[] args) {
        int sum = 0;
        int i = 2;
        while (i <= 100) {
            sum = sum + i;
            i += 2; // i = i + 2
        }
        System.out.println("Sum of even numbers in 1..100 is " + sum);
    }
}
