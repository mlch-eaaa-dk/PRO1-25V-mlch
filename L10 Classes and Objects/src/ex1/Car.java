package ex1;

public class Car {
    private final String brand;
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

    public String getColor() {
        return color;
    }

    public String getRegNo() {
        return regNo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
