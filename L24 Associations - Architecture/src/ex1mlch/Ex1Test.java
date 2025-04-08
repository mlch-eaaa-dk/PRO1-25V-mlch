package ex1mlch;

public class Ex1Test {

    public static void main(String[] args) {
        Dog rex = new Dog(100, "Rex");
        Dog pax = new Dog(110, "Pax");
        Dog fido = new Dog(120, "Fido");
        Dog nuser = new Dog(130, "Nuser");

        Person jens = new Person("Jens", "0101031111", "12341234");
        Person ulla = new Person("Ulla", "1011032222", "3434343434");

        jens.addDog(rex);
        rex.setPerson(jens);

        jens.addDog(pax);
        pax.setPerson(jens);

        ulla.addDog(fido);
        fido.setPerson(ulla);

        System.out.println("Owner: " + jens);
        System.out.println("\tDogs: " + jens.getDogs());
        System.out.println();

        System.out.println("Owner: " + ulla);
        System.out.println("\tDogs: " + ulla.getDogs());
        System.out.println();

        System.out.println("Dog: " + rex);
        System.out.println("\tOwner: " + rex.getPerson());
        System.out.println("Dog: " + pax);
        System.out.println("\tOwner: " + pax.getPerson());
        System.out.println("Dog: " + fido);
        System.out.println("\tOwner: " + fido.getPerson());
        System.out.println("Dog: " + nuser);
        System.out.println("\tOwner: " + nuser.getPerson());
        System.out.println();

        System.out.println("-------------");
        System.out.println();

        jens.removeDog(pax);
        pax.setPerson(null);

        ulla.addDog(pax);
        pax.setPerson(ulla);

        System.out.println("Owner: " + jens);
        System.out.println("\tDogs: " + jens.getDogs());
        System.out.println();

        System.out.println("Owner: " + ulla);
        System.out.println("\tDogs: " + ulla.getDogs());
        System.out.println();

        System.out.println("Dog: " + rex);
        System.out.println("\tOwner: " + rex.getPerson());
        System.out.println("Dog: " + pax);
        System.out.println("\tOwner: " + pax.getPerson());
        System.out.println("Dog: " + fido);
        System.out.println("\tOwner: " + fido.getPerson());
        System.out.println("Dog: " + nuser);
        System.out.println("\tOwner: " + nuser.getPerson());
        System.out.println();
    }
}
