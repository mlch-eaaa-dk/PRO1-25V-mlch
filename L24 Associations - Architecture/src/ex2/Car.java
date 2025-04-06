package ex2;

public class Car {
    private String no; // registration number
    private String year; // year of first registration
    private int pricePrDay;

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
}
