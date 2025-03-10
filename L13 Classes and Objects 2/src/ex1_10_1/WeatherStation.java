package ex1_10_1;

public class WeatherStation {
    private final static double psiInOneBar = 14.503773773; // PSI
    private double temperature; // Celsius
    private double pressure; // bar

    public WeatherStation() {
        temperature = 0; // Celsius
        pressure = 1; // bar
    }

    public WeatherStation(double temperature, double pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public static WeatherStation fromImperial(double fahrenheit, double psi) {
        return new WeatherStation((fahrenheit - 32) / 1.8, psi / psiInOneBar);
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getTemperatureFahrenheit() {
        return 1.8 * temperature + 32;
    }

    public double getPressurePSI() {
        return pressure * psiInOneBar;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setTemperatureFahrenheit(double fahrenheit) {
        this.temperature = (fahrenheit - 32) / 1.8;
    }

    public void setPressurePSI(double psi) {
        this.pressure = psi / psiInOneBar;
    }
}
