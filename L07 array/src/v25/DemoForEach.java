package v25;

public class DemoForEach {
    public static void main(String[] args) {
        int[] t = {3, 6, 1, 4};

        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            int value = t[i];
            sum += value;
        }
        System.out.println("Sum med for sætning: " + sum);

        int sum1 = 0;
        for (int value : t) {
            sum1 += value;
        }
        System.out.println("Sum med for-each sætning: " + sum1);
    }
}
