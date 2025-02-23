package ex3;

public class PersonApp {

    public static void main(String[] args) {
        // ex 3c
        Person p = new Person("Jens");
        System.out.println("Test: " + p);
        System.out.println();

        p.setAddress("Oddervej 1, 8270 Højbjerg");
        System.out.println("Address: " + p.getAddress());
        System.out.println("p = " + p);
        System.out.println();

        p.setMonthlySalary(30000);
        System.out.println("Monthly salary: " + p.getMonthlySalary() + " kr");
        System.out.println("p = " + p);
        System.out.println();

        // ex 3d
        p.printPerson();
        System.out.println();

        // ex 3e
        System.out.printf("Yearly salary: %.0f kr\n", p.yearlySalary());
    }
}
