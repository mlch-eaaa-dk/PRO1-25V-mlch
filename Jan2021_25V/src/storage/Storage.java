package storage;

import model.Fag;
import model.Studerende;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Fag> alleFag = new ArrayList<>();
    private static ArrayList<Studerende> alleStuderende = new ArrayList<>();

    public static ArrayList<Fag> getAlleFag() {
        return alleFag;
    }

    public static ArrayList<Studerende> getAlleStuderende() {
        return alleStuderende;
    }

    public static void gemFag(Fag fag) {
        alleFag.add(fag);
    }

    public static void gemStuderende(Studerende studerende) {
        alleStuderende.add(studerende);
    }
}
