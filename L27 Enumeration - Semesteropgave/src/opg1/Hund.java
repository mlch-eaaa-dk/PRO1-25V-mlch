package opg1;

public class Hund {
    private String navn;
    private int pris;
    private Race race;

    public Hund(String navn, int pris, Race race) {
        this.navn = navn;
        this.pris = pris;
        this.race = race;
    }

    public int getPris() {
        return pris;
    }

    public Race getRace() {
        return race;
    }

    @Override
    public String toString() {
        return String.format("Hund(%s, kr %d, %s)", navn, pris, race);
    }
}
