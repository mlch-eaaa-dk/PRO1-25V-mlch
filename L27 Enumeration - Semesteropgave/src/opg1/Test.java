package opg1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Hund> list = new ArrayList<>(List.of(
                new Hund("Rex", 2000, Race.PUDDEL),
                new Hund("Pax", 3000, Race.BOKSER),
                new Hund("Fido", 1000, Race.PUDDEL),
                new Hund("Nuser", 4000, Race.TERRIER),
                new Hund("Pedro", 4000, Race.PUDDEL)
        ));
        System.out.println("Hunde");
        System.out.println(list);
        System.out.println("Samlet pris for hunde af racen " + Race.PUDDEL +
                ": kr " + samletPris(list, Race.PUDDEL));

    }

    public static int samletPris(ArrayList<Hund> hunde, Race race) {
        int samletPris = 0;
        for (Hund hund : hunde) {
            if (hund.getRace() == race) {
                samletPris += hund.getPris();
            }
        }
        return samletPris;
    }
}
