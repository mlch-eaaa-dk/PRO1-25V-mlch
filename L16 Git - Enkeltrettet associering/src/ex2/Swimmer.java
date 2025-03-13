package ex2;

import java.util.ArrayList;

public class Swimmer {
    private final String name;
    private final ArrayList<Double> lapTimes;

    public Swimmer(String name, ArrayList<Double> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name + " " + lapTimes;
    }

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }
}
