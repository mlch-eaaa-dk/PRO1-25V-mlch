package ex4mlch.model;

public class Employee {
    private String name;
    private int wage; // hourly wage

    // association Employee --> 0..1 Company
    private Company company; // nullable

    /** Pre: name not empty, wage >= 0. */
    public Employee(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    /** Pre: name not empty. */
    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    /** Pre: wage >= 0. */
    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return name + " (kr " + wage + ")";
    }

    /** Note: Nullable return value. */
    public Company getCompany() {
        return company;
    }

    /** Note: Nullable param company. */
    public void setCompany(Company company) {
        this.company = company;
    }

    /** Pre: This employee has a company. */
    public int calcSalary() {
        return company.getHours() * wage;
    }
}
