package ex2mlch;

public class Employee {
    // The name of the employee.
    private String name;
    // Whether the employee is a trainee or not.
    private boolean trainee;
    // ex. 2b
    // The employee's age.
    private int age;


    /** Create an employee with age 0. */
    public Employee(String name, boolean trainee) {
        this.name = name;
        this.trainee = trainee;
        this.age = 0;
    }

    // ex. 2c
    /** Create an employee. */
    public Employee(String name, boolean trainee, int age) {
        this.name = name;
        this.trainee = trainee;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Employee(%s, %s, %d)",
                this.name, this.trainee, this.age
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

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // ex. 2d
    /** Add 1 to the employee's age. */
    public void birthday() {
        this.age++;
    }

    // ex. 2e
    /** Print a description of the employee. */
    public void printEmployee() {
        System.out.println("*******************");
        System.out.println("Name: " + this.name);
        System.out.println("Trainee: " + this.trainee);
        System.out.println("Age: " + this.age);
        System.out.println("*******************");
    }
}
