package ex5;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] a = {11, 11, 7, 9, 16, 4, 1};
        int[] b = {11, 11, 7, 9, 16, 4, 1};
        int[] c = {11, 7, 11, 9, 16, 4, 1};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("c = " + Arrays.toString(c));
        System.out.println("a equal b? " + equals(a, b));
        System.out.println("a equal c? " + equals(a, c));
        System.out.println();

        int[] d = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int[] e = {11, 11, 7, 9, 16, 4, 1};
        int[] f = {1, 4, 7, 8, 9, 11, 16};
        System.out.println("d = " + Arrays.toString(d));
        System.out.println("e = " + Arrays.toString(e));
        System.out.println("f = " + Arrays.toString(f));
        System.out.println("Same values d and e? " + sameValues(d, e));
        System.out.println("Same values d and f? " + sameValues(d, f));
    }

    public static boolean equals(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean sameValues(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            boolean valueFound = contains(b, value);
            if (!valueFound) {
                return false;
            }
        }
        for (int i = 0; i < b.length; i++) {
            int value = b[i];
            boolean valueFound = contains(a, value);
            if (!valueFound) {
                return false;
            }
        }
        return true;
    }

    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
