package ex2mlch;

public class Ex2Test {

    public static void main(String[] args) {
        Rental r1 = new Rental(110, "2021-10-23",7);
        Rental r2 = new Rental(120, "2021-10-25",3);
        Rental r3 = new Rental(130, "2021-11-01",5);

        Car c1 = new Car("1", "2018");
        c1.setPricePrDay(100);
        Car c2 = new Car("2", "2019");
        c2.setPricePrDay(200);
        Car c3 = new Car("3", "2019");
        c3.setPricePrDay(300);
        Car c4 = new Car("4", "2020");
        c4.setPricePrDay(200);

        r1.addCar(c1);
        c1.addRental(r1);

        r1.addCar(c2);
        c2.addRental(r1);

        r1.addCar(c3);
        c3.addRental(r1);

        r2.addCar(c1);
        c1.addRental(r2);

        r2.addCar(c4);
        c4.addRental(r2);

        r3.addCar(c1);
        c1.addRental(r3);

        r3.addCar(c4);
        c4.addRental(r3);

        System.out.println("Rental: " + r1);
        System.out.println("\tCars: " + r1.getCars());
        System.out.println();

        System.out.println("Rental: " + r2);
        System.out.println("\tCars: " + r2.getCars());
        System.out.println();

        System.out.println("Rental: " + r3);
        System.out.println("\tCars: " + r3.getCars());
        System.out.println();

        System.out.println("Price of " + r1 +": kr " + r1.calcPrice());
        System.out.println("Price of " + r2 +": kr " + r2.calcPrice());
        System.out.println("Price of " + r3 +": kr " + r3.calcPrice());
        System.out.println();

        System.out.println("Max. days rented for " + c1 + ": " + c1.maxRentalDays() + " days");
        System.out.println("Max. days rented for " + c2 + ": " + c2.maxRentalDays() + " days");
        System.out.println("Max. days rented for " + c3 + ": " + c3.maxRentalDays() + " days");
        System.out.println("Max. days rented for " + c4 + ": " + c4.maxRentalDays() + " days");
    }
}
