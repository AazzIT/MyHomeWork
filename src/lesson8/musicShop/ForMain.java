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
        System.out.println(musicShop.info());
        System.out.println();
        musicShop.removeFromShowcase(new Piano());
        System.out.println();
        musicShop.removeFromShowcase(new Trumpet());
    }
}
