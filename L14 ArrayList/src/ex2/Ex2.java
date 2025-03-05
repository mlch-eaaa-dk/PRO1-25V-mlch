package ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("numbers: " + numbers);
        System.out.println();

        // Test of sum() method: correct sum is 61.
        int total = sum(numbers);
        System.out.println("Sum: " + total);

        // Test of minimum() method: correct minimum is -16.
        // TODO

        // Test of maximum() method: correct maximum is 45.
        // TODO

        // Test of average() method: correct average is 7.625.
        // TODO

        // Test of zeroes() method: correct number of zeroes is 2.
        // TODO

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
        // TODO
    }

    /**
     * Return the sum of all numbers in the list.
     * Return 0, if the list is empty.
     */
    public static int sum(ArrayList<Integer> list) {
        // TODO
        return 0;
    }

    /**
     * Return the minimum of all numbers in the list.
     * Pre: The list is not empty.
     */
    public static int minimum(ArrayList<Integer> list) {
        // TODO
        return 0;
    }

    /**
     * Return the maximum of all numbers in the list.
     * Pre: The list is not empty.
     */
    public static int maximum(ArrayList<Integer> list) {
        // TODO
        return 0;
    }

    /**
     * Return the average of the numbers in the list.
     * Pre: The list is not empty.
     */
    public static double average(ArrayList<Integer> list) {
        // TODO
        return 0.0;
    }

    /**
     * Return the number of zeros in the list.
     */
    public static int zeroes(ArrayList<Integer> list) {
        // TODO
        return 0;
    }

    /**
     * Return a new list containing the even numbers in the list.
     */
    public static ArrayList<Integer> evens(ArrayList<Integer> list) {
        // TODO
        return null;
    }
}
