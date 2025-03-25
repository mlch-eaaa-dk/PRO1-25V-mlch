package ex3;

import java.time.LocalDate;

public class Rental {
    private final int number;
    private int days;
    private final LocalDate startDate;
    private final double price;

    /**
     * Create a rental.
     * Pre: number > 0, days >= 0, price >= 0.
     */
    public Rental(int number, int days, double price, LocalDate startDate) {
        this.number = number;
        this.days = days;
        this.price = price;
        this.startDate = startDate;
    }

    public int getNumber() {
        return number;
    }

    public double getPricePrDay() {
        return price;
    }

    /** Pre: days >= 0. */
    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    /** Return the end date. */
    public LocalDate getEndDate() {
        return startDate.plusDays(days);
    }

    /** Return the total price. */
    public double getTotalPrice() {
        return price * days;
    }
}
