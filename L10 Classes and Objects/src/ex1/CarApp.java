package ex1;

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
    }
}
