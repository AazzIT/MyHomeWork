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
        // смысл кода внутри try_catch приобрёл Якорьность и теперь стал лишним удалить его?
        // Он был нужен только для проверки срабатывания ексепшна
        try {
            musicShop.info();
            musicShop.addToShowcase(guitar); //Boat anchor  удалить немогу так как было нужно для проверки ексепшна
            musicShop.addToShowcase(piano); //Boat anchor  удалить немогу так как было нужно для проверки ексепшна
            musicShop.addToShowcase(trumpet); //Boat anchor  удалить немогу так как было нужно для проверки ексепшна
            musicShop.info(); //Boat anchor  удалить немогу так как было нужно для проверки ексепшна
            for (int i = 0; i <= 11; i++) {
                musicShop.addToShowcase(new Guitar());
            } //Boat anchor  удалить немогу так как было нужно для проверки ексепшна
            musicShop.info(); //Boat anchor  удалить немогу так как было нужно для проверки ексепшна
        } catch (FullShowCaseException e) {
            System.out.println("\n" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
        }

    }
}
