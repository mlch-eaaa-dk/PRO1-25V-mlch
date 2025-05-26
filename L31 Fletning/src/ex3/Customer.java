package ex3;

public class Customer implements Comparable<Customer> {
    private final String firstName;
    private final String lastName;

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
        int compLastName = this.lastName.compareTo(other.lastName);
        if (compLastName != 0) {
            return compLastName;
        }
        return this.firstName.compareTo(other.firstName);
    }

}
