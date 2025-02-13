package ex4student;

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

    public static void exA(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            System.out.printf("%2d: ", row);
            // print stars
            int starCount = rowCount - row + 1;
            for (int i = 1; i <= starCount; i++) {
                System.out.print('*');
            }
            // print dashes
            int dashCount = rowCount - starCount;
            for (int i = 1; i <= dashCount; i++) {
                System.out.print('-');
            }
            System.out.println();
        }
    }

    public static void exB(int rowCount) {
        // TODO
        System.out.println("NOT IMPLEMENTED");
    }

    public static void exC(int rowCount) {
        // TODO
        System.out.println("NOT IMPLEMENTED");
    }

    public static void exD(int rowCount) {
        // TODO
        System.out.println("NOT IMPLEMENTED");
    }
}
