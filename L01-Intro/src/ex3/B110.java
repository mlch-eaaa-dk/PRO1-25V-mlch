package ex3;

public class B110 {
    public static void main(String[] args) {
        System.out.println(15 / 1.6 / ((50 * 60 + 30) / 3600.0));


        double miles = 15 / 1.6;
        double hours = (50 * 60 + 30) / 3600.0;
        double averageSpeed = miles / hours;
        System.out.println("Average speed is " + averageSpeed + " miles/hour");
    }
}
