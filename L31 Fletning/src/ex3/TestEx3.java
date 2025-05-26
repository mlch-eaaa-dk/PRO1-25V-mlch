package ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestEx3 {

    public static void main(String[] args) {
        Customer[] arr1 = {
                new Customer("Peter", "Abelsen"),
                new Customer("Anna", "Simonsen"),
                new Customer("Hans", "Hansen"),
                new Customer("Peter", "Jensen"),
                new Customer("Jens", "Abelsen"),
                new Customer("Pia", "Petersen") };

        ArrayList<Customer> list = new ArrayList<>(Arrays.asList(arr1));
        Collections.sort(list);
        System.out.println("list = " + list);
        Customer[] arr = {
                new Customer("Peter", "Abelsen"),
                new Customer("Hans", "Hansen"),
                new Customer("Hanne", "Iversen"),
                new Customer("Pia", "Petersen") };
		Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));

        ArrayList<Customer> list3 = goodCustomers(list, arr);
        System.out.println("list3 = " + list3);
    }

    /**
    * Return a sorted ArrayList containing all customers
    * from l1 that are not in l2.
    * Pre: l1 and l2 are sorted and l2 has no empty entries.
    */
    public static ArrayList<Customer> goodCustomers(
            ArrayList<Customer> l1, Customer[] l2) {
        ArrayList<Customer> list = new ArrayList<>();
        int i1 = 0, i2 = 0;
        while (i1 < l1.size() && i2 < l2.length) {
            if (l1.get(i1).compareTo(l2[i2]) < 0) {
                list.add(l1.get(i1));
                i1++;
            } else if (l1.get(i1).compareTo(l2[i2]) > 0) {
                i2++;
            } else {
                i1++;
                i2++;
            }
        }
        while (i1 < l1.size()) {
            list.add(l1.get(i1));
            i1++;
        }
        return list;
    }
}
