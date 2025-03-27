package demosearching.binarysearch;

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
        return navn + " (" + nummer + ", kr " + køb + ")";
    }
}
