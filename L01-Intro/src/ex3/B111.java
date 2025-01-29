package ex3;

public class B111 {
    public static void main(String[] args) {
        int secondsInOneYear = 365 * 24 * 3600;
        double oneYearIncrease = secondsInOneYear * (1.0 / 7 - 1.0 / 13 + 1.0 / 45);

        int populationSizeNow = 312_032_486;
        System.out.print("Population now: ");
        System.out.println(populationSizeNow);

        double populationSizeAfterOneYear = populationSizeNow + oneYearIncrease;
        System.out.print("After 1 year : ");
        System.out.println(populationSizeAfterOneYear);

        double populationSizeAfterTwoYears = populationSizeAfterOneYear + oneYearIncrease;
        System.out.print("After 2 years:  ");
        System.out.println(populationSizeAfterTwoYears);

        double populationSizeAfterThreeYears = populationSizeAfterTwoYears + oneYearIncrease;
        System.out.print("After 3 years:  ");
        System.out.println(populationSizeAfterThreeYears);

        double populationSizeAfterFourYears = populationSizeAfterThreeYears + oneYearIncrease;
        System.out.print("After 4 years:  ");
        System.out.println(populationSizeAfterFourYears);

        double populationSizeAfterFiveYears = populationSizeAfterFourYears + oneYearIncrease;
        System.out.print("After 5 years:  ");
        System.out.println(populationSizeAfterFiveYears);

        System.out.println(populationSizeAfterFiveYears / 1E6 + " millions");
        System.out.printf("%,.0f", populationSizeAfterFiveYears);
    }
}
