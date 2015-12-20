package lesson3.musicShop;

public class MusicShop {
    public String name;
    public MusicalInstrument[] instrument;
    public int count;

    public MusicShop() {
        instrument = new MusicalInstrument[10];
        count = 0;
    }

    public void addInstrument(MusicalInstrument instrument) {
        this.instrument[count] = instrument;
        count++;
    }

    public void info() {
        System.out.println(instrument[count].getName());
    }
}
