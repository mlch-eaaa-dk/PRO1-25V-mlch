package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fag {
    private String navn;
    private String klasse;

    // associering Fag --> 0..* Lektion
    private final ArrayList<Lektion> lektioner = new ArrayList<>();

    public Fag(String navn, String klasse) {
        this.navn = navn;
        this.klasse = klasse;
    }

    public String getNavn() {
        return navn;
    }

    public String getKlasse() {
        return klasse;
    }

    public ArrayList<Lektion> getLektioner() {
        return lektioner;
    }

    public void addLektion(Lektion lektion) {
        lektioner.add(lektion);
    }

    // removeLektion() ikke nødvendig

    // S4
    public ArrayList<Studerende> sygdomPåDato(LocalDate dato) {
        ArrayList<Studerende> sygePåDato = new ArrayList<>();
        for (Lektion lektion : lektioner) {
            if (lektion.getDato().equals(dato)) {
                for (Deltagelse deltagelse : lektion.getDeltagelser()) {
                    if (deltagelse.isRegistreret() &&
                            deltagelse.getStatus() == DeltagerStatus.SYG &&
                            !sygePåDato.contains(deltagelse.getStuderende())
                    ) {
                        sygePåDato.add(deltagelse.getStuderende());
                    }
                }
            }

        }
        return sygePåDato;
    }

    // S10 del
    public Lektion mestFraværLektion() {
        Lektion mestFraværLektion = null;
        int max = 0;
        for (Lektion lektion : lektioner) {
            if (lektion.antalFravær() > max) {
                mestFraværLektion = lektion;
                max = lektion.antalFravær();
            }
        }
        return mestFraværLektion;
    }

    @Override
    public String toString() {
        return navn + " " + klasse;
    }
}
