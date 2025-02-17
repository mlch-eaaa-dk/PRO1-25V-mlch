package ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many values?");
        int size = scan.nextInt();

        int[] values = new int[size];
        int max = 0;
        System.out.println("Type " + size + " values:");
        for (int i = 0; i < size; i++) {
            values[i] = scan.nextInt();
            if (values[i] > max) {
                max = values[i];
            }
        }
        for (int i = 0; i < size; i++) {
            int starCount = values[i] * 40 / max;
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
