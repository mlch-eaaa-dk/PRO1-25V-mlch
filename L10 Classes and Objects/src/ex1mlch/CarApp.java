package ex1mlch;

public class CarApp {

    public static void main(String[] args) {
        Car myCar = new Car("VW UP", "White", "AB 12.345", 50000);
        System.out.println("Test: " + myCar.toString());
        System.out.println();

        String brand = myCar.getBrand();
        System.out.println("Brand " + brand);
        System.out.println("My car: " + myCar.getBrand() + ", " +
                myCar.getColor() + ", " + myCar.getRegNo());

        myCar.setKm(65000);
        System.out.println("Km nu: " + myCar.getKm());

        // ex. 1b
        Car newCar = new Car("Aston Martin", "Red", "XY 44.555", 0);
        System.out.println("Test: " + myCar);
        System.out.println();

        // ex. 1c
        System.out.println("Brand of new car: " + newCar.getBrand());
        System.out.println("Color of new car: " + newCar.getColor());

        // ex. 1d
        newCar.setKm(25000);
        System.out.println("Km of new car: " + newCar.getKm());
        System.out.println();

        // ex. 1e
        myCar.printCar();
        System.out.println();
        newCar.printCar();
        System.out.println();
    }
}
