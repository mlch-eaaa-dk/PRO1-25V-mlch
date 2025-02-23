package ex3;

public class Person {
    private final String name;
    private String address;
    private int monthlySalary;

    public Person(String name) {
        this.name = name;
        this.address = null;
        this.monthlySalary = 0;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.monthlySalary = 0;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return String.format("Person(%s, %s, %d kr)",
                this.name, this.address, this.monthlySalary
        );
    }

    /**
     * Print a description of the person.
     */
    public void printPerson() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Monthly salary: " + this.monthlySalary + " kr");
    }

    /**
     * Return the yearly salary (including bonus).
     */
    public double yearlySalary() {
        return 12 * this.monthlySalary * (1 + 0.025);
    }
}
