package v25;

public class RefVar {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = 20;
        System.out.println("Efter x = 20:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();

        Person p1 = new Person("Nora", 10);
        Person p2 = p1;
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        p1.setAge(20);
        System.out.println("Efter p1.setAge(20):");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println();

        p1 = new Person("Ulla", 12);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println();

        String s1 = "Ib";
        String s2 = s1;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        s1 = s1 + " Jensen";
        System.out.println("Efter s1 = 20:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println();

        String s3 = "Hans";
        System.out.println("s3 = " + s3);
        String s4 = "Hansine";
        s4 = s4.substring(0,4);
        System.out.println("s4 = " + s4);
        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("s3.equals(s4): " + s3.equals(s4));
    }
}

class Person { // OBS: not public
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person(" + name + " " + age + ")";
    }

    public void setAge(int age) {
        this.age = age;
    }
}
