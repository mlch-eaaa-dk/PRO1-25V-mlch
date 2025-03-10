package ex2_10_4;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println("p1: " + p1);
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println("p2: " + p2);
        System.out.println();

        System.out.printf("Distance by p1.distance(p2): %.3f\n", p1.distance(p2));
        System.out.printf("Distance by p1.distance(p2.x, p2.y): %.3f\n", p1.distance(p2.getX(), p2.getY()));
        System.out.printf("Distance by MyPoint.distance(p1, p2): %.3f\n", MyPoint.distance(p1, p2));
    }
}
