package ex2ex3ex4;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        // ex. 2
        int[] arr2 = {4, 6, 7, 2, 3};
        System.out.println("arr2 = " + Arrays.toString(arr2));

        int total2 = sum(arr2);
        System.out.println("Sum = " + total2);
        System.out.println();

        // ex. 3
        int[] arrA = {4, 6, 7, 2, 3};
        int[] arrB = {4, 6, 8, 2, 6};
        System.out.println("arrA = " + Arrays.toString(arrA));
        System.out.println("arrB = " + Arrays.toString(arrB));

        int[] arrTotal = sumArrays(arrA, arrB);

        System.out.println("Sum array = " + Arrays.toString(arrTotal));
        System.out.println();

        int[] arrA1 = {4, 6, 7, 2, 3, 8, 10, 12};
        int[] arrB1 = {4, 6, 8, 2, 6};
        System.out.println("arrA1 = " + Arrays.toString(arrA1));
        System.out.println("arrB1 = " + Arrays.toString(arrB1));

        int[] arrTotal1 = sumArrays1(arrA1, arrB1);

        System.out.println("Sum array = " + Arrays.toString(arrTotal1));
        System.out.println();

        // ex. 4
        System.out.println("arrA = " + Arrays.toString(arrA));

        boolean hasUnevenA = hasUneven(arrA);

        System.out.println("arrA has uneven: " + hasUnevenA);
        System.out.println();

        System.out.println("arrB = " + Arrays.toString(arrB));

        boolean hasUnevenB = hasUneven(arrB);

        System.out.println("arrB has uneven: " + hasUnevenB);
        System.out.println();
    }

    // ex. 2
    public static int sum(int[] t) {
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        return sum;
    }

    // ex. 3
    public static int[] sumArrays(int[] a, int[] b) {
        int[] sumArr = new int[a.length];
        for (int i = 0; i < sumArr.length; i++) {
            sumArr[i] = a[i] + b[i];
        }
        return sumArr;
    }

    public static int[] sumArrays1(int[] a, int[] b) {
        int[] sumArr = new int[Math.max(a.length, b.length)];
        int minLength = Math.min(a.length, b.length);
        for (int i = 0; i < minLength; i++) {
            sumArr[i] = a[i] + b[i];
        }
        if (a.length > b.length) {
            for (int i = minLength; i < a.length; i++) {
                sumArr[i] = a[i];
            }
        } else { // a.length <= b.length
            for (int i = minLength; i < b.length; i++) {
                sumArr[i] = b[i];
            }
        }
        return sumArr;
    }

    public static int[] sumArrays2(int[] a, int[] b) {
        int[] sumArr = new int[Math.max(a.length, b.length)];
        for (int i = 0; i < sumArr.length; i++) {
            if (i < a.length)
                sumArr[i] += a[i];
            if (i < b.length)
                sumArr[i] += b[i];
        }
        return sumArr;
    }

    // ex. 4
    public static boolean hasUneven(int[] t) {
        boolean hasFoundUneven = false;
        int i = 0;
        while (!hasFoundUneven && i < t.length) {
            if (t[i] % 2 != 0) {  // OBS: -7 % 2 er -1,  7 % 2 er 1
                hasFoundUneven = true;
            }
            i++;
        }
        return hasFoundUneven;
    }

    public static boolean hasUneven1(int[] t) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasUneven2(int[] t) {
        for (int value: t) {
            if (value % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
