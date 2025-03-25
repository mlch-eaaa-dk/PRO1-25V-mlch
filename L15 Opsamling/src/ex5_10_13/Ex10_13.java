package ex5_10_13;

public class Ex10_13 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println(r1);
        System.out.printf("Area of r1 is %.1f\n", r1.getArea());
        System.out.printf("Perimeter of r1 is %.1f\n", r1.getPerimeter());
        System.out.println();

        System.out.println("r1 contains (3,3)? " + r1.contains(3, 3));
        MyRectangle2D r2 = new MyRectangle2D(4, 5, 10.5, 3.2);
        System.out.println("r1 contains " + r2 + "? " + r1.contains(r2));
        MyRectangle2D r3 = new MyRectangle2D(3, 5, 2.3, 5.4);
        System.out.println("r1 overlabs " + r3 + "? " + r1.overlaps(r3));
        System.out.println();

//        double[] xs = {2.1, 3.3, 3.4, 7.4};
//        double[] ys = {2.3, 2.1, 6.8, 6.9};
//        System.out.println("r1.contains all points? " + r1.contains(xs, ys));
//        System.out.println();

//        System.out.println("----------------");
//        System.out.println();
//
//        Point p = new Point(3, 3);
//        System.out.println("r1 contains " + p + "? " + r1.contains(3, 3));
//        System.out.println();
//
//        Point[] allPoints = {new Point(2.1, 2.3), new Point(3.3, 2.1), new Point(3.4, 6.8), new Point(7.4, 6.9)};
//        System.out.println("r1.contains all points? " + r1.contains(allPoints));
    }
}
