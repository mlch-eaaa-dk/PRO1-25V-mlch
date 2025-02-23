package ex4_9_1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println("Test: " + r1);
        System.out.println("Test: " + r2);
        System.out.println();

        System.out.println("Width and height of r1 is " + r1.getWidth() + " and " + r1.getHeight());
        System.out.println("Area of r1 = " + r1.getArea());
        System.out.println("Perimeter of r1 = " + r1.getPerimeter());
        System.out.println();

        System.out.println("Width and height of r2 is " + r2.getWidth() + " and " + r2.getHeight());
        System.out.printf("Area of r2 = %.2f\n", r2.getArea());
        System.out.println("Perimeter of r2 = " + r2.getPerimeter());
    }
}
