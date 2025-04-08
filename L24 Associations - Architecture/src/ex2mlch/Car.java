package ex2mlch;

import java.util.ArrayList;

public class Car {
    private String no; // registration number
    private String year; // year of first registration
    private int pricePrDay;

    // association Car --> 0..* Rental
    private final ArrayList<Rental> rentals = new ArrayList<>();

    public Car(String no, String year) {
        this.no = no;
        this.year = year;
        pricePrDay = 0;
    }

    public String getNo() {
        return no;
    }

    public String getYear() {
        return year;
    }

    public int getPricePrDay() {
        return pricePrDay;
    }

    public void setPricePrDay(int pricePrDay) {
        this.pricePrDay = pricePrDay;
    }

    @Override
    public String toString() {
        return String.format("Car(%s,%s,%d)", no, year, pricePrDay);
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public void removeRental(Rental rental) {
        rentals.remove(rental);
    }

    public int maxRentalDays() {
        int max = 0;
        for (Rental rental : rentals) {
            if (rental.getDays() > max) {
                max = rental.getDays();
            }
        }
        return max;
    }
}
