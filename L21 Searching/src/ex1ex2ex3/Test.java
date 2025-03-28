package ex1ex2ex3;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] numbers = {7, 56, 34, 3, 7, 14, 13, 4};
//		int[] numbers = { 8, 56, 34, 4, 8, 14, 12, 4 };

        System.out.println("Ex. 1:");
        System.out.println(Arrays.toString(numbers));
        System.out.println(unevenExists(numbers));
        System.out.println();

        System.out.println("Ex. 2:");
        System.out.println(Arrays.toString(numbers));
        System.out.println(in10To15(numbers));
        System.out.println();

        System.out.println("Ex. 3a:");
        int[] tal1 = {7, 9, 13, 7, 9, 13};
        System.out.println(Arrays.toString(tal1));
        System.out.println(twoAdjacent(tal1));
        int[] tal2 = {7, 9, 13, 13, 9, 7};
        System.out.println(Arrays.toString(tal2));
        System.out.println(twoAdjacent(tal2));
        int[] tal3 = {7, 9, 13, 7, 9, 13, 8, 9, 13, 13};
        System.out.println(Arrays.toString(tal3));
        System.out.println(twoAdjacent(tal3));
        System.out.println();

        System.out.println("Ex. 3b:");
        int[] tal4 = {7, 9, 13, 7, 9, 13, 8, 9, 13, 13};
        System.out.println(Arrays.toString(tal4));
        System.out.println(nAdjacent(tal4, 3));
        int[] tal5 = {7, 9, 13, 13, 13, 13, 9, 7, 8};
        System.out.println(Arrays.toString(tal5));
        System.out.println(nAdjacent(tal5, 3));
        int[] tal6 = {7, 9, 13, 12, 13, 8, 8, 8};
        System.out.println(Arrays.toString(tal6));
        System.out.println(nAdjacent(tal6, 3));
        System.out.println();

    }

    // ex. 1

    /** Return true, if an uneven number exists in the array. */
    public static boolean unevenExists(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length) {
            if (arr[i] % 2 != 0) {
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }

    // ex. 1 ALTERNATIVE with return in loop
    public static boolean unevenExistsALT(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] % 2 != 0) {
                return true;
            }
            i++;
        }
        return false;
    }

    // ex. 1 ALTERNATIVE with return in loop and for statement
    public static boolean unevenExistsALT1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    // ex. 1 ALTERNATIVE with return in loop and for-each statement
    public static boolean unevenExistsALT2(int[] arr) {
        for (int value : arr) {
            if (value % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    // ex. 2

    /** Return the first number in the interval [10;15] in the array.
     * Return -1, if no numbers are in the interval.
     * Pre: The array contains omly positive numbers.
     */
    public static int in10To15(int[] arr) {
        int value = -1;
        int i = 0;
        while (value == -1 && i < arr.length) {
            if (10 <= arr[i] && arr[i] <= 15) {
                value = arr[i];
            } else {
                i++;
            }
        }
        return value;
    }

    // ex. 2 ALTERNATIVE
    public static int in10To15ALT(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (10 <= arr[i] && arr[i] <= 15) {
                return arr[i];
            }
            i++;
        }
        return -1;
    }

    // ex. 3a

    /** Return true, if the array contains 2 equal adjacent numbers. */
    public static boolean twoAdjacent(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length - 1) {
            if (arr[i] == arr[i + 1]) {
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }

    // ex. 3a ALTERNATIVE
    public static boolean twoAdjacentALT(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // ex. 3b

    /**
     * Return true, if the array contains n equal adjacent values.
     * Pre: n >= 2.
     */
    public static boolean nAdjacent(int[] arr, int n) {
        boolean found = false;
        int i = 0;
        while (!found && i <= arr.length - n) {
            boolean nSameFound = nSame(arr, i, n);
            if (nSameFound) {
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }

    // Returns true, if the array contains n equal adjacent values,
    // placed at the index i and forward.
    // Pre: i + n < arr.length.
    private static boolean nSame(int[] arr, int i, int n) {
        boolean foundDiff = false;
        int value = arr[i];
        int j = i + 1;
        while (!foundDiff && j < i + n) {
            if (arr[j] != value) {
                foundDiff = true;
            } else {
                j++;
            }
        }
        return !foundDiff;
    }

    // ex. 3b ALTERNATIVE
    /**
     * Returns true, if the array contains n equal adjacent values.
     * Pre: n >= 2.
     */
    public static boolean nAdjacentALT(int[] arr, int n) {
        for (int i = 0; i <= arr.length - n; i++) {
            boolean sameFound = nSameALT(arr, i, n);
            if (sameFound) {
                return true;
            }
        }
        return false;
    }

    // Returns true, if the array contains n equal adjacent values,
    // placed at the index i and forward.
    // Pre: i + n < arr.length.
    private static boolean nSameALT(int[] arr, int i, int n) {
        int value = arr[i];
        for (int j = i + 1; j < i + n; j++) {
            if (arr[j] != value) {
                return false;
            }
        }
        return true;
    }

    // Ex. 3b ONE big method.
    /**
     * Returns true, if the array contains n equal adjacent values.
     * Pre: n >= 2.
     */
    public static boolean nAdjacentONE(int[] arr, int n) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length + 1 - n) {
            boolean foundDiff = false;
            int value = arr[i];
            int j = i + 1;
            while (!foundDiff && j < i + n) {
                if (arr[j] != value) {
                    foundDiff = true;
                } else {
                    j++;
                }
            }
            if (!foundDiff) {
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }
}
