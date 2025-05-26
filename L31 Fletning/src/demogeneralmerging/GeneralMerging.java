package demogeneralmerging;

import java.util.ArrayList;
import java.util.List;

public class GeneralMerging {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(3, 5, 7, 9, 9, 10, 12));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 2, 5, 5, 9, 9, 12, 15, 17));
        System.out.println(list1);
        System.out.println(list2);

        ArrayList<Integer> result = intersection(list1, list2);
        System.out.println(result);
    }

    /**
     * Return a sorted ArrayList<Integer> that contains
     * the elements, that are in both s1 and s2.
     * Pre: s1 and s2 are sorted.
     */
    public static ArrayList<Integer> intersection(ArrayList<Integer> s1, ArrayList<Integer> s2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        while (i1 < s1.size() && i2 < s2.size()) {
            if (s1.get(i1) < s2.get(i2)) {
                i1++;
            } else if (s1.get(i1) > s2.get(i2)) {
                i2++;
            } else {
                result.add(s1.get(i1));
                i1++;
                i2++;
            }
        }
        return result;
    }
}
