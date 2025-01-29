package bookchap2;

import java.util.Scanner;

/*
Input number of seconds,
convert it to minutes and seconds,
print minutes and seconds.
*/
public class DisplayTime {
    public static void main(String[] args) {
        // Algorithm:
        // Prompt user for number of seconds
        // Read number of seconds
        // Compute minutes
        // Compute remaining seconds
        // Print minutes and remaining seconds

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of seconds: ");
        int seconds = scanner.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}
