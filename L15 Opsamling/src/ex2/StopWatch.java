package ex2;

import java.time.Duration;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;
    private int antal;
    public StopWatch() {
        startTime = null;
        endTime = null;
    }

    public void start() {
        startTime = LocalTime.now();
    }

    public void stop() {
        endTime = LocalTime.now();
    }

    public double elapsedTime() {
        Duration duration = Duration.between(startTime, endTime);
        long seconds = duration.getSeconds();
        long nanos = duration.getNano();
        return seconds + nanos / 1E9;
    }
}
