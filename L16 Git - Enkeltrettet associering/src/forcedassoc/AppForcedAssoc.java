package forcedassoc;

public class AppForcedAssoc {
    public static void main(String[] args) {
        // create a group
        Group groupA = new Group("Group A");

        // create a person ib connected to groupA
        Person ib = new Person("Ib", groupA);
        System.out.println("Ib's group: " + ib.getGroup());

        // change ib's group from groupA to groupB
        Group groupB = new Group("Group B");
        ib.setGroup(groupB);
        System.out.println("Ib's group: " + ib.getGroup());

//        // setting ib's group to null is not allowed
//        ib.setGroup(null); // not allowed!
//        System.out.println("Ib's group: " + ib.getGroup());
    }
}
