package lesson6.musicShop;

public class MusicShop {
    private String name;
    private MusicalInstrument[] musicalInstruments;
    private int count;

    public MusicShop(String name) {
        this.name = name;
        this.musicalInstruments = new MusicalInstrument[10];
    }

    public void addToShowcase(MusicalInstrument musicInstrument) throws FullShowCaseException {
        try {
            this.musicalInstruments[count++] = musicInstrument;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new FullShowCaseException("[Error]: ShoeCase is Full!");
        }
    }

    public void info()  {
        System.out.println("MusicShop \"" + name + "\" sells: ");
        if (count > 0) {
            for(int i = 0; i < count; i++) {
                musicalInstruments[i].info();
            }
            System.out.println("\n");
        } else {
            throw new IllegalArgumentException("[Warning]: Shop is empty!");
        }
    }
}
