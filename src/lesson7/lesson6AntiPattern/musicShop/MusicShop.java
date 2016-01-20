package lesson7.lesson6AntiPattern.musicShop;

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

    @Override
    public String toString() {
        String result = "MusicShop \"" + name + "\" sells: ";
        if (count > 0) {
            for(int i = 0; i < count; i++) {
                result += "\r\n" + musicalInstruments[i].toString() + "\r\n";
            }
        } else {
            throw new IllegalArgumentException("[Warning]: Shop is empty!");
        }
        return result;
    }
}
