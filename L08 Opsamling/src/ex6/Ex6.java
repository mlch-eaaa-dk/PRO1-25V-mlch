package ex6;

public class Ex6 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[101]; // lockers[0] not used
        for (int nr = 1; nr <= 100; nr++) {
            for (int i = nr; i < lockers.length; i = i + nr) {
                lockers[i] = !lockers[i];
            }
            // System.out.println("After nr " + nr + ": " + Arrays.toString(lockers));
        }
        System.out.println("Opened lockers after student nr 100:");
        for (int i = 1; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
