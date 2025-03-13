package forcedassoc;

public class Person {
    private String name;

    public Person(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Person(" + name + ")";
    }

    //-----------------------------------------------------

    // association Person --> 1 Group
    private Group group; // not nullable

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) { // OBS: Param group can't be null
        this.group = group;
    }
}
