package ex2;

public class Employee {
    // The name of the employee.
    private String name;
    // Whether the employee is a trainee or not.
    private boolean trainee;

    /** Create an employee. */
    public Employee(String name, boolean trainee) {
        this.name = name;
        this.trainee = trainee;
    }

    @Override
    public String toString() {
        return String.format("Employee(%s, %s)",
                this.name, this.trainee
        );
    }

    public String getName() {
        return this.name;
    }

    public boolean isTrainee() {
        return this.trainee;
    }

    public void setTrainee(boolean trainee) {
        this.trainee = trainee;
    }
}
