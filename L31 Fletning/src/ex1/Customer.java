package ex1;

public class Customer implements Comparable<Customer> {
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(Customer other) {
        int compareLastName = lastName.compareTo(other.lastName);
        if (compareLastName != 0) {
            return compareLastName;
        }
        return this.firstName.compareTo(other.firstName);
    }
}
