package ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gender? (Girl or Boy)");
        String gender = scanner.nextLine();
        System.out.println("Age? (positive integer)");
        int age = scanner.nextInt();

        boolean isGirl = gender.equalsIgnoreCase("girl");
        boolean isUnder8 = age < 8;
        if (isGirl) { // girl
            if (isUnder8) {
                System.out.println("Tumbling girls");
            } else {
                System.out.println("Springy girls");
            }
        } else { // boy
            if (isUnder8) {
                System.out.println("Young cubs");
            } else {
                System.out.println("Cool boys");
            }
        }
    }
}
