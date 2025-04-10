package DemoFiles.readlines;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextLinesApp {

    public static void main(String[] args) {
        System.out.println("User directory = " + System.getProperty("user.dir"));
        // CHANGE to YOUR filepath
        File in = new File("L26 Text files - Exceptions/src/DemoFiles/readlines/Test.txt"); // use "/" or "\\", not "\"
        try (Scanner scanner = new Scanner(in)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            System.out.println();
            System.out.println("Nu efter læsning");
        } catch (FileNotFoundException ex) {
            System.out.println("Sorry! An unexpected error has occurred.");
            System.out.println("Technical message: " + ex.getMessage());
        }
    }
}
