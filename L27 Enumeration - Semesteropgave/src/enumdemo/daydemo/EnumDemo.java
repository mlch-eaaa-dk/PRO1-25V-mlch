package enumdemo.daydemo;

import java.util.Random;

public class EnumDemo {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SONDAY
    }

    public static void main(String[] args) {
        System.out.println("Traversing the enumeration:");
        for (Day day : Day.values()) {
            System.out.println(day.name() + " has ordinal value " + day.ordinal());
        }
        System.out.println();

        int dayNo = new Random().nextInt(7);
        Day day = Day.values()[dayNo];

        System.out.println("Using the modern switch statement:");
        String dayStr = switch (day) {
            case MONDAY, WEDNESDAY, FRIDAY -> "PRO1 day";
            case TUESDAY -> "FIT day";
            case THURSDAY -> "SU day";
            case SATURDAY, SONDAY -> "weekend day";
        };
        System.out.println(day + " is " + dayStr);
    }
}
