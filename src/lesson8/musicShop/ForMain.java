package lesson8.musicShop;

public class ForMain {
    public static void main(String[] args) {
        MusicShop musicShop = new MusicShop("Symphony");
        musicShop.addToShowcase(new Guitar());
        musicShop.addToShowcase(new Piano());
        musicShop.addToShowcase(new Trumpet());
        musicShop.addToShowcase(new Trumpet());
        musicShop.addToShowcase(new Piano());
        musicShop.addToShowcase(new Piano());
        musicShop.removeFromShowcase();
        musicShop.removeFromShowcase();
        musicShop.info();
    }
}
