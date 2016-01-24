package lesson8.musicShop;

import java.util.ArrayList;

public class MusicShop {
    private String name;
    private ArrayList<MusicalInstrument> instrumentsList; //Полиморфизм List<>

    public MusicShop(String name) {
        this.name = name;
        this.instrumentsList = new ArrayList<>();
    }

    public void addToShowcase(MusicalInstrument musicInstrument) {
        instrumentsList.add(musicInstrument);
    }

    public void removeFromShowcase(MusicalInstrument musicalInstrument) {
        String nameInstrument = musicalInstrument.getClass().getName();
        instrumentsList
                .stream()
                .filter(instrument -> !nameInstrument.equals(instrument.getClass().getName()))
                .forEach(System.out::println);
    }

    public String info() {
        String returnString;
        returnString = "MusicShop \"" + name + "\" sells: ";
        for (MusicalInstrument musicalInstrument : instrumentsList) {
            returnString += "\n" + musicalInstrument.toString();
        }
        return returnString;
    }
}
