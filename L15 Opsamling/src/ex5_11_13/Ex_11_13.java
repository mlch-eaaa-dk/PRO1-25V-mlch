package ex5_11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_11_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i< 10; i++) {
            list.add(scanner.nextInt());
        }

        removeDuplicate(list);
        System.out.print("The distinct integers are ");
        for (int e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        int i = 0;
        while(i < list.size()) {
            int e = list.get(i);
            for (int j = list.size()-1; j > i; j--) {
                if (list.get(j) == e) {
                    list.remove(j);
                }
            }
            i++;
        }
    }
}
