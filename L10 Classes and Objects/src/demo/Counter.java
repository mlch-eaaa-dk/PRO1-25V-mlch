package demo;

public class Counter {
    // felter
    private String color;
    private int count;

    // constructor
    public Counter(String color) {
        this.color = color;
        this.count = 0;
    }

    @Override
    public String toString() {
        return "Counter(" + this.color + ", " + this.count +")";
    }

    public void click() {
        this.count++;
    }

    public void reset() {
        this.count = 0;
    }

    public String getColor() {
        return this.color;
    }

    public int getCount() {
        return this.count;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
