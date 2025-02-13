package ex7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Måned nummer og dag nummer:");
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "Vinter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Forår";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Sommer";
        } else {
            season = "Efterår";
        }

        if ((month == 2 || month == 5 || month == 8 || month == 11) && day >= 21) {
            if (season.equals("Vinter")) {
                season = "Forår";
            } else if (season.equals("Forår")) {
                season = "Sommer";
            } else if (season.equals("Sommer")) {
                season = "Efterår";
            } else {
                season = "Vinter";
            }
        }
        System.out.println(season);
    }
}
