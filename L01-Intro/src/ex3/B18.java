package ex3;

public class B18 {
    public static void main(String[] args) {
        System.out.println(2 * 3.14159 * 6.5);
        System.out.println(6.5 * 6.5 * 3.14159);

        double radius = 6.5;
        final double PI = 3.14159;
        double perimeter = 2 * radius * PI; // omlreds = 2*PI*r
        double area = radius * radius * PI; // areal = PI*r^2
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
