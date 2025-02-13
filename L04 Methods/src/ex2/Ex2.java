package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv 3 heltal:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        String result = order(number1, number2, number3);
        System.out.println(result);

    }
    
    public static String order(int number1, int number2, int number3) {
        String text;
        if (number1 <= number2 && number2 <= number3) {
            text = number1 + " " + number2 + " " + number3 + " er voksende";
        } else if (number1 >= number2 && number2 >= number3) {
            text = number1 + " " + number2 + " " + number3 + " er aftagende";
        } else {
            text = number1 + " " + number2 + " " + number3 + " er hverken-eller";
        }
        return text;
    }
}
