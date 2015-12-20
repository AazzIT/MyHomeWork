package lesson3.musicShop;

public class ForMain {
    public static void main(String[] args) {
        MusicalInstrument guitar = new Guitar();
        MusicalInstrument piano = new Piano();
        MusicalInstrument trumpet = new Trumpet();
        MusicShop musicShop = new MusicShop("Symphony");
        musicShop.addToShowcase(guitar);
        musicShop.addToShowcase(piano);
        musicShop.addToShowcase(trumpet);
        musicShop.info();
    }
}
