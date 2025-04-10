package opg5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberFileGenerator {

    public static void main(String[] args) {
        // CHANGE relativePath to YOUR relativePath to the file !!
        String relativePath = "L26 Text files - Exceptions/src/opg5/";
        String filename;
        int antal;
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("Filename: (end name with .txt");
                filename = relativePath + scanner.next();
                System.out.print("Antal tal der skal skrives i filen: ");
                antal = scanner.nextInt();
                if (antal <= 0) throw new InputMismatchException();
            } catch (InputMismatchException ex) {
                System.out.println("Antal skal være et positivt heltal.");
				throw ex;
            }
        }

        try (PrintWriter printWriter = new PrintWriter(filename)) {
            Random rnd = new Random();
            for (int i = 1; i <= antal; i++) {
                int number = rnd.nextInt(10000);
                printWriter.println(number);
            }
            System.out.println("Fil med " + antal + " tal er nu lavet.");
        } catch (FileNotFoundException ex) {
            System.out.println("Error finding or creating file: " + filename);
        }
    }
}
