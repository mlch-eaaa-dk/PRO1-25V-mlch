package v25;

import java.util.Scanner;

/*
 Input the radius of a circle,
 calculate and print the area of the circle.
 */
public class ComputeArea {
    public static void main(String[] args) {
        // Algorithm (plan):
        // Prompt (ask) the user for the circle's radius
        // Read the radius
        // Calculate the area (area = PI * radius * radius)
        // Print the area

        System.out.println("Indtast radius (decimaltal):");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("Arealet er %.1f\n", area);
    }
}








