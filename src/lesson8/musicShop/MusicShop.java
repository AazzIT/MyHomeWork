package lesson8.musicShop;

import java.util.ArrayList;

public class MusicShop {
    protected String name;
    private ArrayList<MusicalInstrument> instrumentsList;

    public MusicShop(String name) {
        this.name = name;
        this.instrumentsList = new ArrayList<>();
    }

    public void addToShowcase(MusicalInstrument musicInstrument) {
        instrumentsList.add(musicInstrument);
    }

    public void removeFromShowcase(MusicalInstrument musicalInstrument) {
        String nameInstrumentClass;
        nameInstrumentClass = musicalInstrument.toString();
        for (MusicalInstrument instrument : instrumentsList) {
            if (instrument.toString().equals(nameInstrumentClass)) {
                instrumentsList.remove(instrument);
            }
        }
    }

    public String info() {
        String returnString;
        returnString = "MusicShop \"" + name + "\" sells: ";
        for (MusicalInstrument musicalInstrument : instrumentsList) {
            returnString = "\n" + musicalInstrument.toString();
        }
        return returnString;
    }
}
