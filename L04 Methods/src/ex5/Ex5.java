package ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv nummeret på dagen i dag: (søndag er nummer 0)");
        int dayNoInWeek = scanner.nextInt();

        if (dayNoInWeek < 0 || dayNoInWeek > 6) {
            System.out.println("Nummeret skal være mellem 0 (søndag) og 6 (lørdag)");
            return;
        }

        System.out.println("Skriv antal dage fremover:");
        int daysForward = scanner.nextInt();

        int dayNoInFuture = (dayNoInWeek + daysForward) % 7;
        String dayNameToday = dayNumberInWeekToDayName(dayNoInWeek);
        String dayNameInFuture = dayNumberInWeekToDayName(dayNoInFuture);

        System.out.println("I dag er " + dayNameToday + " og dagen i fremtiden er " + dayNameInFuture);
    }

    // Pre: 0 <= dayNo <= 6
    public static String dayNumberInWeekToDayName(int dayNo) {
        String dayName;
        if (dayNo == 0) dayName = "Søndag";
        else if (dayNo == 1) dayName = "Mandag";
        else if (dayNo == 2) dayName = "Tirsag";
        else if (dayNo == 3) dayName = "Onsdag";
        else if (dayNo == 4) dayName = "Torsdag";
        else if (dayNo == 5) dayName = "Fredag";
        else dayName = "Lørdag";
        return dayName;
    }
}
