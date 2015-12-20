package lesson3.musicShop;

public class ForMain {
    public static void main(String[] args) {
        MusicalInstrument guitar = new Guitar();
        MusicalInstrument piano = new Piano();
        MusicalInstrument trumpet = new Trumpet();
        MusicShop musicShop = new MusicShop("Symphony");
        musicShop.addInstrument(guitar);
        musicShop.addInstrument(piano);
        musicShop.addInstrument(trumpet);
        musicShop.info();

    }
}
