package demosearching.linearsearch;

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
                new Kunde("Jens", 4, 400))
        );
        System.out.println(kunder);

        String navn = "Pia";
        Kunde kunde = linearSearchKunde(kunder, navn);
        System.out.printf("Kunde med navn %s i listen: %s \n", navn, kunde);
        System.out.println();

        //-------------------------------------------------------------------------

        String sm = "The quick brown fox jumps over the lazy dog";
        String m = "fox";
        int indexOfText = find(sm, m);
        System.out.printf("Index of '%s' in '%s': %d \n", m, sm, indexOfText);
    }

    // Linear search in array of integers.
    /** Return true, if the target is found in the array. */
    public static boolean linearSearchArray(int[] arr, int target) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length) {
            int k = arr[i];
            if (k == target) {
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }

    // Linear search in ArrayList<String>.

    /**
     * Return the first index, where the target is found in the list.
     * Return -1, if the target is not found in the list.
     */
    public static int linearSearchList(ArrayList<String> list, String target) {
        int indeks = -1;
        int i = 0;
        while (indeks == -1 && i < list.size()) {
            String k = list.get(i);
            if (k.equals(target)) {
                indeks = i;
            } else {
                i++;
            }
        }
        return indeks;
    }

    //-----------------------------------------------------
    // Alternative way of writing the linear search:
    // Linear search in ArrayList<String>.
    /**
     * Return the first index, where the target is found in the list.
     * Return -1, if the target is not found in the list.
     */
    // UGLY CODE according to some programmers!
    public static int linearSearchListALT(ArrayList<String> list, String target) {
        int i = 0;
        while (i < list.size()) {
            String k = list.get(i);
            if (k.equals(target)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    // UGLY CODE according to some programmers!
    public static int linearSearchListALTfor(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            String k = list.get(i);
            if (k.equals(target)) {
                return i;
            }
        }
        return -1;
    }

    // VERY UGLY CODE!
    public static int linearSearchListALTforEach(ArrayList<String> list, String target) {
        int i = 0;
        for (String k : list) {
            if (k.equals(target)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    //-----------------------------------------------------

    // Linear search in ArrayList<Kunde>.

    /**
     * Return the first customer with the given name.
     * Return null, if the customer is not found in the list.
     */
    public static Kunde linearSearchKunde(ArrayList<Kunde> list, String name) {
        Kunde kunde = null;
        int i = 0;
        while (kunde == null && i < list.size()) {
            Kunde k = list.get(i);
            if (k.getNavn().equals(name)) {
                kunde = k;
            } else {
                i++;
            }
        }
        return kunde;
    }

    // ADVANCED SEARCH.
    /**
     * Return the start index of the string m in the string sm.
     * Return -1, if m is not found in sm.
     */
    public static int find(String sm, String m) {
        int indeks = -1;
        int i = 0;
        while (indeks == -1 && i <= sm.length() - m.length()) {
            if (match(sm, m, i)) {
                indeks = i;
            } else {
                i++;
            }
        }
        return indeks;
    }

    // Return true, if m is part of sm, starting at the index i.
    private static boolean match(String sm, String m, int i) {
        boolean foundDiff = false;
        int j = 0;
        while (!foundDiff && j < m.length()) {
            char k = sm.charAt(i + j);
            if (k != m.charAt(j)) {
                foundDiff = true;
            } else {
                j++;
            }
        }
        return !foundDiff;
    }

    // ADVANCED SEARCH alternative way of writing
    public static int findAlt(String sm, String m) {
        int i = 0;
        while (i <= sm.length() - m.length()) {
            boolean matchFound = matchAlt(sm, m, i);
            if (matchFound) {
                return i;
            }
            i++;
        }
        return -1;
    }

    // Return true, if m is part of sm, starting at the index i.
    private static boolean matchAlt(String sm, String m, int i) {
        int j = 0;
        while (j < m.length()) {
            char k = sm.charAt(i + j);
            if (k != m.charAt(j)) {
                return false;
            }
            j++;
        }
        return true;
    }

    // ADVANCED SEARCH with one method
    public static int findOneMethod(String sm, String m) {
        int indeks = -1;
        int i = 0;
        while (indeks == -1 && i <= sm.length() - m.length()) {
            boolean foundDiff = false;
            int j = 0;
            while (!foundDiff && j < m.length()) {
                char k = sm.charAt(i + j);
                if (k != m.charAt(j)) {
                    foundDiff = true;
                } else {
                    j++;
                }
            }
            if (!foundDiff) {
                indeks = i;
            } else {
                i++;
            }
        }
        return indeks;
    }
}
