package model;

public class Deltagelse {
    private boolean registreret;
    private DeltagerStatus status;

    // komposition Deltagelse --> 1 Lektion
    private Lektion lektion;
    // associering Deltagelse --> 1 Studerende
    private Studerende studerende;

    public Deltagelse(Lektion lektion, Studerende studerende) {
        registreret = false;
        status = DeltagerStatus.TILSTEDE;
        this.lektion = lektion;
        this.studerende = studerende;
    }

    public boolean isRegistreret() {
        return registreret;
    }

    public DeltagerStatus getStatus() {
        return status;
    }

    public Lektion getLektion() {
        return lektion;
    }

    // ingen setLektion() pga. del i komposition

    public Studerende getStuderende() {
        return studerende;
    }

    // ingen setStuderende(), da sammenhængen ikke skal kunne opdateres

    public void setRegistreret(boolean registreret) {
        this.registreret = registreret;
    }

    public void setStatus(DeltagerStatus status) {
        this.status = status;
    }

    // S2
    public boolean erRegistreretFraværende() {
        return registreret && status != DeltagerStatus.TILSTEDE;
    }

    @Override
    public String toString() {
        return studerende.getNavn() +  " " + registreret + " " +  status;
    }
}
