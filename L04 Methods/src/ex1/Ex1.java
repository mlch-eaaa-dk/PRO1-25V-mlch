package ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv et heltal:");
        int number = scanner.nextInt();

        String numberSign = sign(number);
        System.out.println(numberSign);

        numberSign = sign(number+ number);
        System.out.println(numberSign);
    }

    public static String sign(int number) {
        String signOfNumber;
        if (number < 0) {
            signOfNumber = "negativ";
        } else if (number == 0) {
            signOfNumber = "0";
        } else{
            signOfNumber = "positiv";
        }
        return signOfNumber;
    }
}
