package lesson3.musicShop;

public class MusicalInstrument {
    public String name;
    public MusicShop shop;

    public void inShop(MusicShop shop) {
        this.shop = shop;
    }

    public void info() {
        System.out.println(name + " sold in " + shop.name);
    }
}
