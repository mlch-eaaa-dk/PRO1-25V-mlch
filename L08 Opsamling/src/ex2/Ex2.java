package ex2;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size2 = 10;
        int[] array1 = new int[10];
        int size1 = 0;
        for (int i = 1; i <= 10; i++) {
            int index = (int) (Math.random() * size2);
            int value = array2[index];
            for (int j = index; j < size2 - 1; j++) {
                array2[j] = array2[j + 1];
            }
            size2--;
            array2[size2] = 0;
            array1[size1] = value;
            size1++;
            // Test:
            System.out.println(Arrays.toString(array2));
            System.out.println(Arrays.toString(array1));
            System.out.println();
        }
    }
}
