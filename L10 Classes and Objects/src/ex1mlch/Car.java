package ex1mlch;

public class Car {
    private String brand;
    private String color;
    private String regNo; // registration number
    private int km;

    public Car(String brand, String color, String regNo, int km) {
        this.brand = brand;
        this.color = color;
        this.regNo = regNo;
        this.km = km;
    }

    @Override
    public String toString() {
        return String.format("Car(%s, %s, %s, %,d km)",
                this.brand, this.color, this.regNo, this.km
        );
    }

    public String getBrand() {
        return brand;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    // ex. 1e

    /**
     * Print a description of the car.
     */
    public void printCar() {
        System.out.println("************************");
        System.out.println("* " + brand + ", " + color);
        System.out.println("* " + regNo);
        System.out.println("* " + km + " km");
        System.out.println("************************");
    }
}
