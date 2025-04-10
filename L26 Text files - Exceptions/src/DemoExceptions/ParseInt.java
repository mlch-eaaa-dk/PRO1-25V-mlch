package DemoExceptions;

import java.util.Scanner;

// exception in main(); not caught
public class ParseInt {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Type an integer: ");
            String strNumber = scanner.nextLine();
            int n = 0;
            try {
                n = Integer.parseInt(strNumber);
            } catch(NumberFormatException ex) {
                System.out.println("ERROR " + ex);
            }
            System.out.println("n = " + n);
        }
    }
}
