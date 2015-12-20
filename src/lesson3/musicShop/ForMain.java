package lesson3.musicShop;

public class ForMain {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Trumpet trumpet = new Trumpet();
        MusicShop musicShop = new MusicShop(guitar);
        musicShop.addInstrument(piano);
        musicShop.addInstrument(trumpet);
        musicShop.info();

    }
}
