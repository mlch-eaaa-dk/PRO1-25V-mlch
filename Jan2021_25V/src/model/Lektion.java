package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Lektion {
    private LocalDate dato;
    private LocalTime startTid;
    private String lokale;

    // komposition Lektion --> 0..* Deltagelse
    private final ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Lektion(LocalDate dato, LocalTime startTid, String lokale) {
        this.dato = dato;
        this.startTid = startTid;
        this.lokale = lokale;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getStartTid() {
        return startTid;
    }

    public String getLokale() {
        return lokale;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return deltagelser;
    }

    public void addDeltagelse(Deltagelse deltagelse) {
        deltagelser.add(deltagelse);
    }

    // removeDeltagelse() ikke nødvendig

    // S10 del
    public int antalFravær() {
        int antal = 0;
        for (Deltagelse deltagelse : deltagelser) {
            if (deltagelse.erRegistreretFraværende()) {
                antal++;
            }
        }
        return antal;
    }

    // bruges i gui

    @Override
    public String toString() {
        return dato + " " + startTid + " " + lokale;
    }
}
