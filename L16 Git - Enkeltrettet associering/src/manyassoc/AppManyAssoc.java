package manyassoc;

public class AppManyAssoc {
    public static void main(String[] args) {
        Person ib = new Person("Ib");
        Person ulla = new Person("Ulla");

        // create a group with no persons
        Group groupA = new Group("Group A");
        System.out.println("Persons in Group A: " + groupA.getPersons());

        // add ib to groupA
        groupA.addPerson(ib);
        System.out.println("Persons in Group A: " + groupA.getPersons());

        // add ulla to groupA
        groupA.addPerson(ulla);
        System.out.println("Persons in Group A: " + groupA.getPersons());

        // remove ib from groupA
        groupA.removePerson(ib);
        System.out.println("Persons in Group A: " + groupA.getPersons());
        System.out.println();

        // change ulla´s group from groupA to groupB
        Group groupB = new Group("Group B");
        groupA.removePerson(ulla);
        groupB.addPerson(ulla);
        System.out.println("Persons in Group A: " + groupA.getPersons());
        System.out.println("Persons in Group B: " + groupB.getPersons());
    }
}
