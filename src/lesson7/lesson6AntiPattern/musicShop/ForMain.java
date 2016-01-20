package lesson7.lesson6AntiPattern.musicShop;

public class ForMain {
    public static final String SHOP_NAME = "Symphony";

    public static void main(String[] args) {
        MusicalInstrument guitar = new Guitar();
        MusicalInstrument piano = new Piano();
        MusicalInstrument trumpet = new Trumpet();
        MusicShop musicShop = new MusicShop(SHOP_NAME);
       try {
           System.out.println(musicShop);
            musicShop.addToShowcase(guitar);
            musicShop.addToShowcase(piano);
            musicShop.addToShowcase(trumpet);
           System.out.println(musicShop);
            for (int i = 0; i <= 11; i++) {
                musicShop.addToShowcase(new Guitar());
            }
           System.out.println(musicShop);
        } catch (FullShowCaseException e) {
            System.out.println("\n" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
        }

    }
}
