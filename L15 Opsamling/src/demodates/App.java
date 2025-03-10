package demodates;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class App {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2014, 6, 3);
        System.out.println("d1 = " + d1);

        LocalDate d2 = LocalDate.of(2016, Month.OCTOBER, 1);
        System.out.println("d2 = " + d2);

        LocalDate d3 = d2.plusMonths(1).plusDays(70);
        System.out.println("d3 = " + d3);
        System.out.println();

        Period period = Period.between(d1, d2);
        System.out.println("period = " + period);

        System.out.printf("From %s to %s: %d years, %d months, %d days\n",
                d1, d2, period.getYears(), period.getMonths(), period.getDays());
        System.out.println();

        long months = d1.until(d2, ChronoUnit.MONTHS);
        System.out.printf("From %s to %s: %d months\n", d1, d2, months);

        long days = d1.until(d2, ChronoUnit.DAYS);
        System.out.printf("From %s to %s: %d days\n", d1, d2, days);
        System.out.println();

        LocalTime t1 = LocalTime.of(0, 0, 10);
        System.out.println("t1 = " + t1);

        LocalTime t2 = t1.plusHours(1).plusMinutes(1).plusSeconds(1);
        System.out.println("t2 = " + t2);
        System.out.println();

        Long seconds = t1.until(t2, ChronoUnit.SECONDS);
        System.out.printf("From %s to %s: %d seconds\n", t1, t2, seconds);
        System.out.println();

        LocalDateTime dt1 = LocalDateTime.of(2014, 7, 25, 0, 0, 10);
        System.out.println("dt1 = " + dt1);

        LocalDateTime dt2 = dt1.plusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1);
        System.out.println("dt2 = " + dt2);
        System.out.println();

        Long seconds1 = ChronoUnit.SECONDS.between(dt1,dt2);
        System.out.printf("From %s to %s: %d seconds\n", dt1, dt2, seconds1);
        System.out.printf("From %1$tF at %1$tT to %2$tF at %2$tT: %3$d seconds\n",
                dt1, dt2, seconds1);
    }
}
