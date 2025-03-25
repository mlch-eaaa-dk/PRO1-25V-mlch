package ex3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex3 {

    public static void main(String[] args) {
        Rental r1 = new Rental(10, 40, 100, LocalDate.now().plusMonths(10));
        System.out.println("Rental r1:");
        System.out.println("----------");
        System.out.println("Number = " + r1.getNumber());
        System.out.println("Days = " + r1.getDays());
        System.out.println("Start date = " + r1.getStartDate());
        System.out.println("Price pr day = " + r1.getPricePrDay());
        System.out.println("--");
		System.out.println("Total price = " + r1.getTotalPrice());
		System.out.println("End Date = " + r1.getEndDate());
        System.out.println("Day before start Date = " + r1.getStartDate().minusDays(1));
        System.out.println();

        Rental r2 = new Rental(11, 10, 200, LocalDate.now().plusMonths(1).withDayOfMonth(1));
        System.out.println("Rental r2:");
        System.out.println("----------");
        System.out.println("Number = " + r2.getNumber());
        System.out.println("Days = " + r2.getDays());
        System.out.println("Start date = " + r2.getStartDate());
        System.out.println("Price pr day = " + r2.getPricePrDay());
        System.out.println("--");
		System.out.println("Total price = " + r2.getTotalPrice());
        System.out.println("End Date = " + r2.getEndDate());
		System.out.println("Day before start Date = " + r2.getStartDate().minusDays(1));
        System.out.println();

		Period per = Period.between(r2.getEndDate(), r1.getStartDate());
		// Period per = r2.getEndDate().until(r1.getStartDate());
        System.out.printf("From %s to %s: %d years, %d months, %d days\n",
                r2.getEndDate(), r1.getStartDate(), per.getYears(), per.getMonths(), per.getDays());
        System.out.println();

		//long days = ChronoUnit.DAYS.between(r2.getEndDate(), r1.getStartDate());
        Long days = r2.getEndDate().until(r1.getStartDate(), ChronoUnit.DAYS);
        System.out.printf("From %s to %s: %d days\n", r2.getEndDate(), r1.getStartDate(), days);
        System.out.println();
    }
}
