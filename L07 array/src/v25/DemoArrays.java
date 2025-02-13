package v25;

import java.util.Arrays;

public class DemoArrays {

	public static void main(String[] args) {
		// create an array to contain 10 integers
		// all integers are initialized to 0
		int[] numbers = new int[10];
		// print the values in the array
		System.out.print("(1) ");
		System.out.println(Arrays.toString(numbers));
		System.out.println();

		// fill the array with new values
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 10;
		}
		System.out.print("(2) ");
		System.out.println(Arrays.toString(numbers));
		System.out.println();

		// read value at index 5
		int x = numbers[5];
		System.out.print("(3) ");
		System.out.println("Value at index 5: " + x);
		System.out.println();

		// set value at index 5
		numbers[5] = 55;
		System.out.print("(4) ");
		System.out.println("New value at index 5: " + numbers[5]);
		System.out.println();

		// print the indices
		System.out.print("(5) ");
		System.out.print("Index:  ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%5d", i);
		}
		System.out.println();
		// print the values
		System.out.print("(6) ");
		System.out.print("Values: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%5d", numbers[i]);
		}
		System.out.println();
		System.out.println();

		// add 5 to each value
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] + 5;
		}
		System.out.print("(7) ");
		System.out.println(Arrays.toString(numbers));
		System.out.println();

		// easy initialization of an array with known values
		int[] evens = { 2, 4, 6, 8, 10 };
		System.out.print("(8) ");
		System.out.println(Arrays.toString(evens));
		System.out.println();

		// ---------------------------------------------------------------------
		System.out.println("-----------------");
		System.out.println();

		// create an array to contain 6 strings
		// all strings are initialized to null
		String[] names = new String[6];
		System.out.print("(9) ");
		System.out.println(Arrays.toString(names));
		System.out.println();

		// fill the array and print
		names[0] = "John";
		names[1] = "Poul";
		names[2] = "George";
		names[3] = "Ringo";
		System.out.print("(10) ");
		System.out.println(Arrays.toString(names));
		System.out.println();

		// print only the used entries
		System.out.print("(11) ");
		int size = 4;
		for (int i = 0; i < size; i++) {
			System.out.print(names[i] + "  ");
		}
		System.out.println();
		System.out.println();

		// add a new value at the of the used entries and print the array
		names[size] = "Epstein";
		size++;
		System.out.print("(12) ");
		System.out.println(Arrays.toString(names));
		System.out.println();

		// print only the used entries
		System.out.print("(13) ");
		for (int i = 0; i < size; i++) {
			System.out.print(names[i] + "  ");
		}
		System.out.println();
	}
}
