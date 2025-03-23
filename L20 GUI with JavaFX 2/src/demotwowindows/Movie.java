package demotwowindows;

public class Movie {
    private String title;
    private String actor;

    public Movie(String title, String actor) {
        this.title = title;
        this.actor = actor;
    }

    @Override
    public String toString() {
        return title + " " + actor;
    }
}
