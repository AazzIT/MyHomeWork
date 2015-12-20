package lesson3.musicShop;

public class ForMain {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Trumpet trumpet = new Trumpet();
        MusicShop musicShop = new MusicShop();
        musicShop.info();
        guitar.inShop(musicShop);
        guitar.info();
        piano.inShop(musicShop);
        piano.info();
        trumpet.inShop(musicShop);
        trumpet.info();
    }
}
