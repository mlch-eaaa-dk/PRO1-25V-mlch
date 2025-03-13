package ex1;

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

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }

    /**
     * Return the fastest lap time.
     * Pre: The swimmer has at least one lap time.
     */
    public double bestLapTime() {
        // TODO
        return 0;
    }
}
