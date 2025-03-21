package ex2mlch;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("Integers: " + numbers);
        System.out.println();

        // Test of sum() method: correct sum is 61.
        int total = sum(numbers);
        System.out.println("Sum: " + total);

        // Test of minimum() method: correct minimum is -16.
        int min = minimum(numbers);
        System.out.println("Min: " + min);

        // Test of maximum() method: correct maximum is 45.
        int max = maximum(numbers);
        System.out.println("Max: " + max);

        // Test of average() method: correct average is 7.625.
        double average = average(numbers);
        System.out.printf("Average: %.3f\n", average);

        // Test of zeroes() method: correct number of zeroes is 2.
        int zeroCount = zeroes(numbers);
        System.out.println("Zeroes count: " + zeroCount);

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
        ArrayList<Integer> evens = evens(numbers);
        System.out.println("Even numbers in list: " + evens);
    }

//    // sum made with FOR-statement
//    // OBS: exercise requires FOR-EACH
//    public static int sumFor(ArrayList<Integer> list) {
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            int number = list.get(i);
//            sum += number;
//        }
//        return sum;
//    }

    /**
     * Return the sum of all numbers in the list.
     * Return 0 if the list is empty.
     */
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    /**
     * Return the minimum of all numbers in the list.
     * Pre: The list is not empty.
     */
    public static int minimum(ArrayList<Integer> list) {
        int min = list.getFirst();
        for (int e : list) {
            if (e < min)
                min = e;
        }
        return min;
    }

    /**
     * Return the maximum of all numbers in the list.
     * Pre: The list is not empty.
     */
    public static int maximum(ArrayList<Integer> list) {
        int max = list.getFirst();
        for (int e : list) {
            if (e > max)
                max = e;
        }
        return max;
    }

    /**
     * Return the average of the numbers in the list.
     * Pre: The list is not empty.
     */
    public static double average(ArrayList<Integer> list) {
//        int sum = 0;
//        for (int e : list) {
//            sum += e;
//        }
        return (double) sum(list) / list.size();
    }

    /** Return the number of zeros in the list. */
    public static int zeroes(ArrayList<Integer> list) {
        int zeroCount = 0;
        for (int e : list) {
            if (e == 0)
                zeroCount++;
        }
        return zeroCount;
    }

    /** Return a new list containing the even numbers in the list. */
    public static ArrayList<Integer> evens(ArrayList<Integer> list) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int e : list) {
            if (e % 2 == 0)
                evens.add(e);
        }
        return evens;
    }
}
