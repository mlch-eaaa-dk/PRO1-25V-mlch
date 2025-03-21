package ex4;

import java.util.ArrayList;
import java.util.List;

public class Ex4Test {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 4, 9, 16, 25));
        System.out.println("list1 = " + list1);

        ArrayList<Integer> list2 = new ArrayList<>(List.of(2, 5, 8, 5));
        System.out.println("list2 = " + list2);

        ArrayList<Integer> list3 = new ArrayList<>(List.of(2, 6, 8, 5));
        System.out.println("list3 = " + list3);
        System.out.println();

        System.out.println("Second highest in list1: " + secondHighest(list1));
        System.out.println("Second highest in list2: " + secondHighest(list2));
        System.out.println("Second highest in list3: " + secondHighest(list3));
        System.out.println();

        System.out.println("list1 is sorted ascending: " + isSortedAscending(list1));
        System.out.println("list2 is sorted ascending: " + isSortedAscending(list2));
        System.out.println("list3 is sorted ascending: " + isSortedAscending(list3));
        System.out.println();

        shiftRight(list1);
        System.out.println("list1 after shift right: " + list1);
        System.out.println();

        System.out.println("list2 has doublets: " + hasDoublets(list2));
        System.out.println("list3 has doublets: " + hasDoublets(list3));
        System.out.println();

        swapFirstLast(list2);
        System.out.println("list2 after swap of first and last: " + list2);
        System.out.println();

        zeroEvensOut(list3);
        System.out.println("list3 after even numbers replaced by 0: " + list3);
        System.out.println();
    }

    // Pre: list.size() >= 1
    public static void swapFirstLast(ArrayList<Integer> list) {
        int temp = list.getFirst();
        list.set(0, list.removeLast());
        list.add(temp);
    }

    public static void zeroEvensOut(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                list.set(i, 0);
        }
    }

    // Pre: list.size() >= 2
    public static int secondHighest(ArrayList<Integer> list) {
        int highest = Math.max(list.get(0), list.get(1));
        int secondHighest = Math.min(list.get(0), list.get(1));

        for (int i = 2; i < list.size(); i++) {
            if (list.get(i) > highest) {
                secondHighest = highest;
                highest = list.get(i);
            } else if (list.get(i) > secondHighest) {
                secondHighest = list.get(i);
            }
        }
        return secondHighest;
    }

    public static boolean isSortedAscending(ArrayList<Integer> list) {
        boolean isSorted = true;
        int i = 1;
        while (isSorted && i < list.size()) {
            if (list.get(i) < list.get(i - 1)) {
                isSorted = false;
            }
            i++;
        }
        return isSorted;
    }

    // pre: arr.length >= 1
    public static void shiftRight(ArrayList<Integer> list) {
        int temp = list.removeLast();
        list.addFirst(temp);
    }

    public static boolean hasDoublets(ArrayList<Integer> list) {
        if (list.size() < 2) return false;

        boolean doubletsFound = false;
        int i = 0;
        while (!doubletsFound && i < list.size() - 1) {
            int number = list.get(i);
            int j = i + 1;
            while (!doubletsFound && j < list.size()) {
                if (list.get(j) == number) {
                    doubletsFound = true;
                }
                j++;
            }
            i++;
        }
        return doubletsFound;
    }

    public static boolean hasDoublets1(ArrayList<Integer> list) {
        if (list.size() < 2) return false;

        int i = 0;
        while (i < list.size() - 1) {
            int number = list.get(i);
            int j = i + 1;
            while (j < list.size()) {
                if (list.get(j) == number) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
