package lesson6.musicShop;

public class ForMain {
    public static void main(String[] args) {
        MusicalInstrument guitar = new Guitar();
        MusicalInstrument piano = new Piano();
        MusicalInstrument trumpet = new Trumpet();
        MusicShop musicShop = new MusicShop("Symphony");
        //Try Call IllegalArgumentException
        try {
            musicShop.getInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
        }
        try {
            musicShop.addToShowcase(guitar);
            musicShop.addToShowcase(piano);
            musicShop.addToShowcase(trumpet);
            musicShop.getInfo();
        } catch (FullShowCaseException e1) {
            System.out.println("\n" + e1.getMessage());
        }
        //Try call FullShowCaseException
        try {
            for (int i = 0; i <= 11; i++) {
                musicShop.addToShowcase(new Guitar());
            }
        } catch (FullShowCaseException e) {
            System.out.println("\n" + e.getMessage());
        }
    }
    //Вот эти три трай-кеча можно объединить в один и сделать один трай и три кеча с разными эксепшенами. Главное соблюдать
    //иерархию эксепшенов - сначала более конкретные, потом более общие.
}
