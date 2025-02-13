package ex5;

public class Ex66 {
    public static void main(String[] args) {
        displayPattern(10);
    }

    public static void displayPattern(int n) {
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(col + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
