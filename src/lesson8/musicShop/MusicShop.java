package lesson8.musicShop;

import java.util.ArrayList;
import java.util.Arrays;

public class MusicShop {
    public String name;
    ArrayList<MusicalInstrument> instrumentsList;

    public MusicShop(String name) {
        this.name = name;
        this.instrumentsList = new ArrayList<>();
    }

    public void addToShowcase(MusicalInstrument musicInstrument) {
        instrumentsList.add(musicInstrument);
    }

    public void removeFromShowcase(MusicalInstrument musicalInstrument) {
        instrumentsList
                .stream()
                .filter(instrument -> !musicalInstrument.getClass().getName().equals(instrument.getClass().getName()))
                //вот это паровоз!))) если тут выскочит ошибка, ты можешь не найти, в каком из вызванных методов она возникла.
                //эти вещи можно разбить и присвоить временным переменным, так и читать будет проще.
                //Иначе не соблюдается закон Деметры - гуглим
                .forEach(System.out::println);
    }

    public void info() {
        System.out.println("MusicShop \"" + name + "\" sells: ");
        instrumentsList
                .forEach(System.out::println);
    }
}
