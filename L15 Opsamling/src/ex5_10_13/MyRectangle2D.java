package ex5_10_13;

public class MyRectangle2D {
    private double x, y;
    private double width, height;

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    @Override
    public String toString() {
        return String.format("Rectangle2D(x=%.1f, y=%.1f, w=%.1f, h=%.1f)", x, y, width, height);
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public boolean contains(double x, double y) {
        boolean xInside = this.x <= x && x <= this.x + width;
        boolean yInside = this.y <= y && y <= this.y + height;
        return xInside && yInside;
    }

    public boolean contains(MyRectangle2D r) {
        return this.contains(r.x, r.y) &&
                this.contains(r.x + r.width, r.y + r.height);
    }

    public boolean overlaps(MyRectangle2D r) {
        return this.contains(r.x, r.y) ||
                this.contains(r.x + r.width, r.y) ||
                this.contains(r.x, r.y + r.height) ||
                this.contains(r.x + r.width, r.y + r.height);
    }
}
