package lesson8.musicShop;

import java.util.ArrayList;
import java.util.List;

public class MusicShop {
    private String name;
    private List<MusicalInstrument> instrumentsList;

    public MusicShop(String name) {
        this.name = name;
        this.instrumentsList = new ArrayList<>();
    }

    public void addToShowcase(MusicalInstrument musicInstrument) {
        instrumentsList.add(musicInstrument);
    }

    public String info() {
        String returnString = "MusicShop \"" + name + "\" sells: ";
        for (MusicalInstrument musicalInstrument : instrumentsList) {
            returnString += "\n" + musicalInstrument.toString();
        }
        return returnString;
    }
}
