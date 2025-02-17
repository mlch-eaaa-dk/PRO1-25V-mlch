package ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many values?");
        int size = scan.nextInt();

        int[] values = new int[size];
        String[] names = new String[size];
        int max = 0;
        int maxLengthNames = 0;
        System.out.println("Type " + size + " values with name and size");
        for (int i = 0; i < size; i++) {
            names[i] = scan.next();
            values[i] = scan.nextInt();
            if (values[i] > max) {
                max = values[i];
            }
            if (names[i].length() > maxLengthNames) {
                maxLengthNames = names[i].length();
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.printf("%" + maxLengthNames + "s ", names[i]);
            int starCount = values[i] * 40 / max;
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
