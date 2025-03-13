package manyassoc;

import java.util.ArrayList;

public class Group {
    private String name;

    public Group(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group(" + name + ")";
    }

    //-----------------------------------------------------

    // association Group --> 0..* Person
    private final ArrayList<Person> persons = new ArrayList<>();

    public ArrayList<Person> getPersons() {
        return new ArrayList<>(persons);
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }
}
