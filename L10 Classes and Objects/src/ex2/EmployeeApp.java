package ex2;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee e1 = new Employee("Hans Jensen", true);
        System.out.println("Test: " + e1);
        System.out.println();

        System.out.println("Name: " + e1.getName());
        System.out.println("Trainee? " + e1.isTrainee());
        System.out.println();

        e1.setTrainee(false);
        System.out.println("Trainee? " + e1.isTrainee());
    }
}
