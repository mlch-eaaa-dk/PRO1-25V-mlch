package democompareto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String per = "Per";
        String hans = "Hans";
        String per2 = new String("Per");
        System.out.println("per.compareTo(hans) returns " + per.compareTo(hans));
        System.out.println("hans.compareTo(per) returns " + hans.compareTo(per));
        System.out.println("per.compareTo(per2) returns " + per.compareTo(per2));
        System.out.println();

        // Hvis en klasse T implementerer Comparable<T> interfacet,
        // kan klassens objekter sammenlignes med compareTo(T t) metoden
        // (og derfor også sorteres).
        // Alle Javas almindelige klasser som String, LocalDate, Integer, Double, osv.
        // har en compareTo() metode.

        //         |  a. compareTo(b) returns
        //---------+--------------------------
        //  a < b  |     < 0   (negative int)
        //  a = b  |     = 0   (zero)
        //  a > b  |     > 0   (positive int)

        if (hans.compareTo(per2) < 0) {
            System.out.println("Hans kommer før Per");
        }

        System.out.println();
        System.out.println("//-------------------------------------------------");
        System.out.println();

        ArrayList<Integer> integers = new ArrayList<>(List.of(
                11, 3, 2, 5, 17, 9, 30, 15, 2, 4, 11, 10
        ));
        System.out.println("Før sortering:");
        System.out.println(integers);

        // Integer implements the Comparable<Integer> interface
        // (Integer has a compareTo(Integer) method)
        Collections.sort(integers);
        System.out.println("Efter sortering:");
        System.out.println(integers);
        System.out.println();

        ArrayList<String> strings = new ArrayList<>(List.of(
                "Ea", "Yvonne", "Ulla", "Pia", "Anne", "Anna", "Berit"
        ));
        System.out.println("Før sortering:");
        System.out.println(strings);

        // String implements the Comparable<String> interface
        // (String has a compareTo(String) method)
        Collections.sort(strings);
        System.out.println("Efter sortering:");
        System.out.println(strings);
        System.out.println();

        //-------------------------------------------------

        ArrayList<Player> players = new ArrayList<>(List.of(
                new Player("Per", 11), new Player("Hans", 3), new Player("Ib", 2),
                new Player("Jens", 5), new Player("Pia", 17), new Player("Ulla", 9),
                new Player("Per", 30), new Player("Hans", 15), new Player("Per", 2),
                new Player("Pia", 4), new Player("Mike", 11), new Player("Ea", 10)
        ));
        System.out.println("Før sortering:");
        System.out.println(players);

        // Player implements the Comparable<Player> interface
        // (Player has a compareTo(Player) method)
        Collections.sort(players);
        System.out.println("Efter sortering:");
        System.out.println(players);
    }
}
