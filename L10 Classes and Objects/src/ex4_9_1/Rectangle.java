package ex4_9_1;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle(%.2f, %.2f)", this.width, this.height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.height;
    }
}
