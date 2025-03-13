package zerooneassoc;

public class AppZeroOneAssoc {
    public static void main(String[] args) {
        Group groupA = new Group("Group A");
        Group groupB = new Group("Group B");

        // create a person ib without a group
        Person ib = new Person("Ib"); // ib's group is null
        System.out.println("Ib's group: " + ib.getGroup());

        // set ib's group to groupA
        ib.setGroup(groupA);
        System.out.println("Ib's group: " + ib.getGroup());

        // change ib's group from groupA to groupB
        ib.setGroup(groupB);
        System.out.println("Ib's group: " + ib.getGroup());

        // remove ib's group
        ib.setGroup(null);
        System.out.println("Ib's group: " + ib.getGroup());
    }
}
