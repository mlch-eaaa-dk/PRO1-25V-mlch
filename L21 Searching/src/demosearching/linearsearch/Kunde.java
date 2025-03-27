package demosearching.linearsearch;

public class Kunde {
    private String navn;
    private int nummer;
    private int køb;

    public Kunde(String navn, int nummer, int køb) {
        this.navn = navn;
        this.nummer = nummer;
        this.køb = køb;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return String.format("Kunde(%s, %d, %dkr)", navn, nummer, køb);
    }
}
