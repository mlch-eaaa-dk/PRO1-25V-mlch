package ex2mlch;

import java.util.ArrayList;

public class Rental {
    private int no;
    private String date;
    private int days; // days of rental

    // association Rental --> 0..* Car
    private final ArrayList<Car> cars = new ArrayList<>();

    public Rental(int no, String date, int days) {
        this.no = no;
        this.date = date;
        this.days = days;
    }

    public int getNo() {
        return no;
    }

    public String getDate() {
        return date;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Rental(" + no + "," + date + "," + days + ")";
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public int calcPrice() {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getPricePrDay() * days;
        }
        return sum;
    }
}
