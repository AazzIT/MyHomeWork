package lesson3.musicShop;

public class MusicShop {
    public String name;
    private MusicalInstrument[] musicInstrument;
    private int count;

    public MusicShop(String name) {
        this.name = name;
        this.musicInstrument = new MusicalInstrument[10];
        count = 0;

    }

    public void addInstrument(MusicalInstrument musicInstrument) {
        this.musicInstrument[count] = musicInstrument;
        this.count++;
    }

    public void info() {
        System.out.println("MusicShop \"" + name + "\" sells: ");
        if (count > 0) {
            for(int i = 0; i <= count + 1; i++) {
                System.out.println(musicInstrument[i].name);
            }
            System.out.println("\r\n");
        } else {
            System.out.println(name + "shop is empty");
        }
    }
}
