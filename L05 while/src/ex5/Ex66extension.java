package ex5;

public class Ex66extension {
    public static void main(String[] args) {
        displayPattern(20);
    }

    public static void displayPattern(int n) {
        int row = 1;
        while (row <= n) {
            int emptyCount = n - row;
            int col = 1;
            while (col <= emptyCount) {
                System.out.print("   ");
                col++;
            }
            col = 1;
            while (col <= row) {
                System.out.printf("%3d", col);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
