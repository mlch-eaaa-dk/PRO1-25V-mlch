package bookchap2;

import java.util.Scanner;

/*
Input the radius of a circle,
calculate and print the area of the circle.
*/
public class ComputeArea {
    public static void main(String[] args) {
        // Algorithm:
        // Prompt user for radius of circle
        // Read radius (using Scanner class)
        // Compute area of circle (area = pi * radius * radius)
        // Print area

        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        double area = PI * radius * radius;
        System.out.println("Area of circle of radius " + radius + " is " + area);
    }
}
