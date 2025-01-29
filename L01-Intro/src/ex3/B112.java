package ex3;

public class B112 {
    public static void main(String[] args) {
        double kilometers = 24 * 1.6;
        double hours = (1 * 3600 + 40 * 60 + 35) / 3600.0;
        double averageSpeed = kilometers / hours;
        System.out.println("Average speed is " + averageSpeed + " km/hour");
    }
}
