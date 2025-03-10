package ex2_10_4;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("MyPoint(%.3f, %.3f)", x, y);
    }

    public double distance(MyPoint point) {
        return distance(point.x, point.y);
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        return p1.distance(p2);
    }
}
