package ex2mlch;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee e1 = new Employee("Hans Jensen", true);
        System.out.println("Test: " + e1);
        System.out.println();

        System.out.println("Name: " + e1.getName());
        System.out.println("Trainee? " + e1.isTrainee());
        System.out.println();

        e1.setTrainee(false);
        e1.printEmployee();
        System.out.println();

        // ex 2b
        e1.setAge(20);
        System.out.println("Age: " + e1.getAge());
        System.out.println();

        // ex 2c
        Employee e2 = new Employee("Peter Hansen", false, 30);
        System.out.println("Test: " + e2);
        System.out.println();

        // ex 2d
        e2.birthday();
        System.out.println("Age: " + e2.getAge());
        System.out.println();

        // ex. 2e
        e2.setTrainee(false);
        e2.printEmployee();
    }
}
