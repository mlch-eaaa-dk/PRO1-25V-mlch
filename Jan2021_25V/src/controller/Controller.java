package controller;

import model.*;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Controller {
    public static Fag opretFag(String navn, String klasse) {
        Fag fag = new Fag(navn, klasse);
        Storage.gemFag(fag);
        return fag;
    }

    public static Lektion opretLektion(
            LocalDate dato,
            LocalTime startTid,
            String lokale,
            Fag fag
    ) {
        Lektion lektion = new Lektion(dato, startTid, lokale);
        fag.addLektion(lektion);
        return lektion;
    }

    public static Studerende opretStuderende(String navn, String email) {
        Studerende studerende = new Studerende(navn, email);
        Storage.gemStuderende(studerende);
        return studerende;
    }

    public static void opretDeltagelser(Fag fag, Studerende studerende) {
        for (Lektion lektion : fag.getLektioner()) {
            opretDeltagelse(lektion, studerende);
        }
    }

    private static Deltagelse opretDeltagelse(Lektion lektion, Studerende studerende) {
        Deltagelse deltagelse = new Deltagelse(lektion, studerende);
        lektion.addDeltagelse(deltagelse);
        studerende.addDeltagelse(deltagelse);
        return deltagelse;
    }

    // S8
    public static ArrayList<Studerende> studerendeTilObservation(int grænse) {
        ArrayList<Studerende> studTilObs = new ArrayList<>();
        for (Studerende studerende : Storage.getAlleStuderende()) {
            int antal = 0;
            for (Deltagelse deltagelse : studerende.getDeltagelser()) {
                if (deltagelse.getStatus() == DeltagerStatus.FRAVÆR &&
                        deltagelse.isRegistreret()) {
                    antal++;
                }
            }
            if (antal > grænse) {
                studTilObs.add(studerende);
            }
        }
        // TODO: studTilObs skal sorteres på studerendes navne
        return studTilObs;
    }

    // S9
    public static void fraværOmgængere(
            String[] omgængere,
            ArrayList<Studerende> megetFravær,
            String filnavn
    ) {
        // TODO
    }

    public static ArrayList<Fag> getAlleFag() {
        return Storage.getAlleFag();
    }

    public static void updateDeltagelse(Deltagelse deltagelse, boolean registret, DeltagerStatus status) {
        deltagelse.setRegistreret(registret);
        deltagelse.setStatus(status);
    }
}
