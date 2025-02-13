package ex4;

public class Stars {
    public static void main(String[] args) {
        exA(10);
        System.out.println();

        exB(10);
        System.out.println();

        exC(10);
        System.out.println();

        exD(10);
        System.out.println();

        exD(11);
        System.out.println();
    }

    // Print the char 'ch' 'count' times
    public static void printChar(char ch, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(ch);
        }
    }

    public static void exA(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            System.out.printf("%2d: ", row);
            // print stars
            int starCount = rowCount - row + 1;
            //printChar('*', starCount);
            for (int i = 1; i <= starCount; i++) {
                System.out.print('*');
            }
            // print dashes
            int dashCount = rowCount - starCount;
            //printChar(' ', dashCount);
            for (int i = 1; i <= dashCount; i++) {
                System.out.print('-');
            }

            System.out.println();
        }
    }

    public static void exB(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            System.out.printf("%2d: ", row);
            // print dashes
            int dashCount = rowCount - row;
            printChar(' ', dashCount);
            // print stars
            int starCount = rowCount - dashCount;
            printChar('*', starCount);
            System.out.println();
        }
    }

    public static void exC(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            System.out.printf("%2d: ", row);
            // print dashes
            int dashCount = row - 1;
            printChar('-', dashCount);
            // print stars
            int starCount = rowCount - dashCount;
            printChar('*', starCount);
            System.out.println();
        }
    }

    public static void exD(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            System.out.printf("%2d: ", row);
            int starCount;
            if (row <= rowCount / 2) {
                starCount = 2 * row - 1;
            } else {
                starCount = 2 * (rowCount - row) + 1;
            }
            int dashCount = rowCount - starCount;
            // print dashes
            printChar('-', dashCount / 2);
            // print stars
            printChar('*', starCount);
            // print dashes
            printChar('-', dashCount / 2);
            System.out.println();
        }
    }
}
