package demototalmerging;

import java.util.ArrayList;
import java.util.List;

public class TotalMerging {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(3, 5, 7, 9, 9, 10, 12));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 2, 5, 5, 9, 9, 12, 15, 17));
        System.out.println(list1);
        System.out.println(list2);

        ArrayList<Integer> result = merge(list1, list2);
        System.out.println(result);
    }

    /**
     * Return a sorted ArrayList<Integer>
     * that contains all elements from s1 and s2.
     * Pre: s1 and s2 are sorted.
     */
    public static ArrayList<Integer> merge(ArrayList<Integer> s1, ArrayList<Integer> s2) {
        ArrayList<Integer> result = new ArrayList<>();

        // merge, as long as both lists contains elements
        int i1 = 0;
        int i2 = 0;
        while (i1 < s1.size() && i2 < s2.size()) {
            if (s1.get(i1) < s2.get(i2)) {
                // s1's element at i1 is smallest
                result.add(s1.get(i1));
                i1++;
            } else if (s1.get(i1) > s2.get(i2)) {
                // s2's element at i2 is smallest
                result.add(s2.get(i2));
                i2++;
            } else {
                // the element at i1 is equal to the element at i2
                result.add(s1.get(i1));
                i1++;
            }
        }

        // copy from the list that isn't empty
        while (i1 < s1.size()) {
            result.add(s1.get(i1));
            i1++;
        }
        while (i2 < s2.size()) {
            result.add(s2.get(i2));
            i2++;
        }

        return result;
    }
}
