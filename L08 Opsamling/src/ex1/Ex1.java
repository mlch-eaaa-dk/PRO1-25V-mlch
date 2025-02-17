package ex1;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] values = new int[20];
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) (Math.random() * 6) + 1;
        }
        System.out.println(Arrays.toString(values));

        boolean inRun = false;
        for (int i = 0; i < values.length; i++) {
            if (inRun) {
                if (values[i] != values[i - 1]) {
                    System.out.print(")");
                    inRun = false;
                }
            }
            if (!inRun) {
                if (i != values.length - 1 && values[i] == values[i + 1]) {
                    System.out.print(" (");
                    inRun = true;
                }
            }
            System.out.print(" " + values[i]);
        }
        if (inRun) {
            System.out.println(")");
        }
    }
}
