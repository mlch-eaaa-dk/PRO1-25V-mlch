package model;

import java.util.ArrayList;

public class Studerende {
    private String navn;
    private String email;

    // associering Studerende --> 0..* Deltagelse
    private final ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public Studerende(String navn, String email) {
        this.navn = navn;
        this.email = email;
    }

    public String getNavn() {
        return navn;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Deltagelse> getDeltagelser() {
        return deltagelser;
    }

    public void addDeltagelse(Deltagelse deltagelse) {
        deltagelser.add(deltagelse);
    }

    // removeDeltagelse() er ikke nødvendig

    // S3
    public int antalFraværsLektioner() {
        int antal= 0;
        for (Deltagelse deltagelse : deltagelser) {
            if (deltagelse.erRegistreretFraværende()) {
                antal++;
            }
        }
        return antal;
    }
}
