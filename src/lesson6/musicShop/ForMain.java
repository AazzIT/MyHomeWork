package lesson6.musicShop;

public class ForMain {
    public static final String SHOP_NAME = "Symphony"; //Хардкод, название магазина "Symphony" вынесен в константу

    public static void main(String[] args) {
        MusicalInstrument guitar = new Guitar();
        MusicalInstrument piano = new Piano();
        MusicalInstrument trumpet = new Trumpet();
        MusicShop musicShop = new MusicShop(SHOP_NAME); //Хардкод, название магазина "Symphony" вынесен в константу
        //Try Call IllegalArgumentException and FullShowCaseException
        // Собрал всё в один try_catch как ты и рекомендовала, но при этом сразу срабатывает ексепшн на пустой магазин
        try {
            musicShop.getInfo();
            musicShop.addToShowcase(guitar);
            musicShop.addToShowcase(piano);
            musicShop.addToShowcase(trumpet);
            musicShop.getInfo();
            for (int i = 0; i <= 11; i++) {
                musicShop.addToShowcase(new Guitar());
            }
            musicShop.getInfo();
        } catch (FullShowCaseException e) {
            System.out.println("\n" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
        }

    }
}
