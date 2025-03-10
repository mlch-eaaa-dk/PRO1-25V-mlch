package ex1_10_1;

public class Ex10_1App {
    public static void main(String[] args) {
        WeatherStation ws1 = new WeatherStation();
        WeatherStation ws2 = new WeatherStation(35, 0.5);
        WeatherStation ws3 = WeatherStation.fromImperial(68, 21);

        System.out.printf("ws1 temperature: %.1f Celsius\n", ws1.getTemperature());
        System.out.printf("ws1 temperature: %.1f Fahrenheit\n", ws1.getTemperatureFahrenheit());
        System.out.printf("ws1 pressure: %.1f bar\n", ws1.getPressure());
        System.out.printf("ws1 pressure: %.1f PSI\n", ws1.getPressurePSI());
        System.out.println();

        System.out.printf("ws2 temperatuer: %.1f Celsius\n", ws2.getTemperature());
        System.out.printf("ws2 temperature: %.1f Fahrenheit\n", ws2.getTemperatureFahrenheit());
        System.out.printf("ws2 pressure: %.1f bar\n", ws2.getPressure());
        System.out.printf("ws2 pressure: %.1f PSI\n", ws2.getPressurePSI());
        System.out.println();

        System.out.printf("ws3 temperature: %.1f Celcius\n", ws3.getTemperature());
        System.out.printf("ws3 temperature: %.1f Fahrenheit\n", ws3.getTemperatureFahrenheit());
        System.out.printf("ws3 pressure: %.1f bar\n", ws3.getPressure());
        System.out.printf("ws3 pressure: %.1f PSI\n", ws3.getPressurePSI());
        System.out.println();
    }
}
