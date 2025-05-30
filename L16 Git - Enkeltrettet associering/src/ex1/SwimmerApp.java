package ex1;

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

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(jan);
        swimmers.add(bo);
        swimmers.add(mikkel);

        for (Swimmer swimmer : swimmers) {
            System.out.println(swimmer.getName() + "'s bedste tid: " + swimmer.bestLapTime());
        }
    }
}
