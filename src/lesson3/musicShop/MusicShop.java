package lesson3.musicShop;

public class MusicShop {
    public String name;
    private MusicalInstrument[] musicalInstruments;
    private int count;

    public MusicShop(String name) {
        this.name = name;
        this.musicalInstruments = new MusicalInstrument[10];
    }

    public void addToShowcase(MusicalInstrument musicInstrument) {
        this.musicalInstruments[count] = musicInstrument;
        count++;
    }

    public void getInfo() {
        System.out.println("MusicShop \"" + name + "\" sells: ");
        if (count > 0) {
            for(int i = 0; i < count; i++) {
                musicalInstruments[i].info();
            }
            System.out.println("\r\n");
        } else {
            System.out.println(name + "shop is empty");
        }
    }
}
