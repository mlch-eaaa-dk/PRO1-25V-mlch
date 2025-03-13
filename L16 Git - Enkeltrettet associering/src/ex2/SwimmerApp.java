package ex2;

import java.util.ArrayList;
import java.util.List;

public class SwimmerApp {

    public static void main(String[] args) {
        ArrayList<Double> lapTimesJan = new ArrayList<>(
                List.of(1.02, 1.01, 0.99, 0.98, 1.02, 1.04, 0.99)
        );
        Swimmer jan = new Swimmer("Jan", lapTimesJan);

        ArrayList<Double> lapTimesBo = new ArrayList<>(
                List.of(1.05, 1.01, 1.04, 1.06, 1.08, 1.04, 1.02)
        );
        Swimmer bo = new Swimmer("Bo", lapTimesBo);

        ArrayList<Double> lapTimesMikkel = new ArrayList<>(
                List.of(1.03, 1.01, 1.02, 1.05, 1.03, 1.06, 1.03)
        );
        Swimmer mikkel = new Swimmer("Mikkel", lapTimesMikkel);

        TrainingPlan tpA = new TrainingPlan('A', 16, 10);
        TrainingPlan tpB = new TrainingPlan('B', 10, 6);

        ArrayList<TrainingPlan> plans = new ArrayList<>();
        plans.add(tpA);
        plans.add(tpB);
    }
}
