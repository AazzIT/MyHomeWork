package lesson3.musicShop;

import lesson3.flowerBouquet.Flower;

public class MusicShop {
    public String name;
    public MusicalInstrument[] musicalInstrument;
    private int count;

    public MusicShop(MusicalInstrument musicalInstrument) {
        name = "Symphony";
        this.musicalInstrument = new MusicalInstrument[10];
        this.musicalInstrument[0] = musicalInstrument;
        count = 1;
    }

    public void addInstrument(MusicalInstrument musicalInstrument) {
        this.musicalInstrument[count] = musicalInstrument;
        count++;
    }

    public void info() {
        System.out.println("MusicShop \"" + name + "\" cells: ");
        for(int i = 0; i <= count  - 1; i++) {
            musicalInstrument[i].info();
        }
        System.out.println("\r\n");
    }
}
