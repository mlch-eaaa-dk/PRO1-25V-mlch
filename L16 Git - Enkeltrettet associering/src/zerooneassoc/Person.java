package zerooneassoc;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person(" + name + ")";
    }

    //-----------------------------------------------------

    // association Person --> 0..1 Group
    private Group group; // nullable

    /** Note: Nullable return value. */
    public Group getGroup() {
        return group;
    }

    /** Note: Nullable param group. */
    public void setGroup(Group group) {
        this.group = group;
    }
}
