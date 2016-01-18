package lesson8.musicShop;

import java.util.ArrayList;
import java.util.Arrays;

public class MusicShop {
    public String name;
    MusicalInstrument[] instruments = {};
    ArrayList<MusicalInstrument> instrumentsList;

    public MusicShop(String name) {
        this.name = name;
        this.instrumentsList = new ArrayList<>(Arrays.asList(instruments));
    }

    public void addToShowcase(MusicalInstrument musicInstrument) {
        instrumentsList.add(musicInstrument);
    }

    public void removeFromShowcase() {
        instrumentsList.remove(instrumentsList.size() - 1);
    }

    public void info() {
        System.out.println("MusicShop \"" + name + "\" sells: ");
        instrumentsList
                .forEach(System.out::println);
    }
}
