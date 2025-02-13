package v25;

import java.util.Scanner;

/*
 Input number of seconds,
 convert it to minutes and seconds,
 print minutes and seconds.
 */
public class DisplayTime {
    public static void main(String[] args) {
        // Algorithm:
        // Prompt the user for number of seconds
        // calculate minutes
        // calculate remaining seconds
        // print minutes and seconds
        System.out.println("Indtast antal sekunder:");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("Antal minutter er " + minutes +
                ", antal sekunder er " + remainingSeconds);

    }
}











