package ex1mlch;

public class Dog {
    private int number;
    private String name;

    // association Dog --> 0..1 Person
    private Person person; // nullable

    public Dog(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog(" + number + ", " + name + ")";
    }

    /** Note: Nullable return value. */
    public Person getPerson() {
        return person;
    }

    /** Note: Nullable param person. */
    public void setPerson(Person person) {
        this.person = person;
    }
}
