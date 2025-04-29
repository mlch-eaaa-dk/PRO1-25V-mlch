package gui;

import controller.Controller;
import javafx.application.Application;
import model.Fag;
import model.Studerende;

import java.time.LocalDate;
import java.time.LocalTime;

public class Jan2021App {
    public static void main(String[] args) {
        initStorage();
        Application.launch(Jan2021Gui.class);
    }

    public static void initStorage() {
        Studerende peter = Controller.opretStuderende("Peter Hansen", "ph@stud.dk");
        Studerende tina = Controller.opretStuderende("Tina Jensen", "tj@stud.dk");
        Studerende sascha = Controller.opretStuderende("Sascha Petersen", "sp@stud.dk");

        Fag pro1S20 = Controller.opretFag("PRO1", "20S");
        Controller.opretFag("PRO1", "20T");
        Controller.opretFag("SU1", "20S");

        Controller.opretLektion(
                LocalDate.parse("2021-02-01"),
                LocalTime.parse("08:30"), "A1.32", pro1S20);
        Controller.opretLektion(
                LocalDate.parse("2021-02-01"),
                LocalTime.parse("10:30"), "A1.32", pro1S20);
        Controller.opretLektion(
                LocalDate.parse("2021-02-03"),
                LocalTime.parse("08:30"), "A1.32", pro1S20);
        Controller.opretLektion(
                LocalDate.parse("2021-02-03"),
                LocalTime.parse("10:30"), "A1.32", pro1S20);

        Controller.opretDeltagelser(pro1S20, peter);
        Controller.opretDeltagelser(pro1S20, tina);
        Controller.opretDeltagelser(pro1S20, sascha);
    }
}
