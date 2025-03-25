package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch watch = new StopWatch();

        System.out.print("Press the newline key to START the stopwatch");
        scanner.nextLine();
        watch.start();
        System.out.println("Stopwatch is running...");
        System.out.println();

        System.out.print("Press the newline key to STOP the stopwatch");
        scanner.nextLine();
        watch.stop();
        System.out.println("Stopwatch has stopped");
        System.out.println();

        System.out.println("Elapsed time is " + watch.elapsedTime() + " seconds");
    }
}
