package demosearching.linearsearchusingreturn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSearch {

    public static void main(String[] args) {
        int[] numbers = {12, 4, 8, 2, 7, 24, 11, 8, 10};
        System.out.println(Arrays.toString(numbers));

        int value = 8;
        boolean found = linearSearchArray(numbers, value);
        System.out.printf("Is %d in the array: %b \n", value, found);
        System.out.println();

        //-------------------------------------------------------------------------

        ArrayList<String> names = new ArrayList<>(
                List.of("Ulla", "Pia", "Peter", "Hans", "Jens")
        );
        System.out.println(names);

        String name = "Hans";
        int indexOfName = linearSearchList(names, name);
        System.out.printf("Index of %s in the list: %d \n", name, indexOfName);
        System.out.println();

        //-------------------------------------------------------------------------

        ArrayList<Kunde> kunder = new ArrayList<>(List.of(
                new Kunde("Ulla", 1, 100),
                new Kunde("Pia", 2, 200),
                new Kunde("Peter", 3, 300),
                new Kunde("Hans", 5, 500),
                new Kunde("Jens", 4, 400)));
        System.out.println(kunder);
        String navn = "Pia";

        Kunde kunde = linearSearchKunde(kunder, navn);
        System.out.printf("Kunde med navn %s i listen: %s \n", navn, kunde);
        System.out.println();
    }

    // Linear search in array of integers.
    /** Return true, if the target is found in the array. */
    public static boolean linearSearchArray(int[] arr, int target) {
        for (int k : arr) {
            if (k == target) {
                return true;
            }
        }
        return false;
    }

    // Linear search in ArrayList<String>.
    /**
     * Return the first index, where the target is found in the list.
     * Return -1, if the target is not found in the array.
     */
    public static int linearSearchList(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) { // NOT for-each, when index is returned
            String k = list.get(i);
            if (k.equals(target)) {
                return i;
            }
        }
        return -1;
    }

    // Linear search in ArrayList<Kunde>.
    /**
     * Return the first customer with the given name.
     * Return null, if the customer is not found in the list.
     */
    public static Kunde linearSearchKunde(ArrayList<Kunde> list, String name) {
        for (Kunde k: list) {
            if (k.getNavn().equals(name)) {
                return k;
            }
        }
        return null;
    }
}
