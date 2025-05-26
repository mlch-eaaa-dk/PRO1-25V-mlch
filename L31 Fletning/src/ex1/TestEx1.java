package ex1;

import java.util.ArrayList;
import java.util.List;

public class TestEx1 {

    public static void main(String[] args) {
        ArrayList<Customer> list1 = new ArrayList<>(List.of(
                new Customer("Jens", "Abelsen"),
                new Customer("Peter", "Abelsen"),
                new Customer("Hans", "Hansen"),  // Hanne Hansen
                new Customer("Peter", "Jensen")
        ));
        System.out.println("list1 = " + list1);
        ArrayList<Customer> list2 = new ArrayList<>(List.of(
                new Customer("Else", "Abelsen"),
                new Customer("Hanne", "Hansen"),
                new Customer("Hanne", "Iversen"),
                new Customer("Pia", "Petersen"),
                new Customer("Ulla", "Rasmussen"),
                new Customer("Anna", "Simonsen")

        ));
        System.out.println("list2 = " + list2);

        ArrayList<Customer> list3 = mergeAllCustomers(list1, list2);
        System.out.println("list3 = " + list3);
    }

    /**
    * Return a sorted list containing all customers
    * from the lists l1 and l2.
    * Pre: l1 and l2 are sorted.
    */
    public static ArrayList<Customer> mergeAllCustomers(
            ArrayList<Customer> l1, ArrayList<Customer> l2
    ) {
        ArrayList<Customer> all = new ArrayList<>();
        int i1 = 0, i2 = 0;
        while (i1 < l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo(l2.get(i2)) <= 0) {
                all.add(l1.get(i1));
                i1++;
            } else {
                all.add(l2.get(i2));
                i2++;
            }
        }
        while (i1 < l1.size()) {
            all.add(l1.get(i1));
            i1++;
        }
        while (i2 < l2.size()) {
            all.add(l2.get(i2));
            i2++;
        }
        return all;
    }
}
