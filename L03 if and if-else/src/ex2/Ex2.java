package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv 3 heltal:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 <= number2 && number2 <= number3) {
            System.out.println(number1 + " " + number2 + " " + number3 + " er voksende");
        } else if (number1 >= number2 && number2 >= number3) {
            System.out.println(number1 + " " + number2 + " " + number3 + " er aftagende");
        } else {
            System.out.println( "" +number1 + number2 + number3 + " er hverken-eller");
        }
    }
}
