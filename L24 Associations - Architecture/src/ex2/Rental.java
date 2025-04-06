package ex2;

public class Rental {
    private int no;
    private String date;
    private int days; // days of rental

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
}
