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
        musicShop.removeFromShowcase(); //удалять просто последний элемент, это как-то нелогично. Хотелось бы, чтобы можно
        //было удалить либо по имени класса, либо еще по каким-то параметрам. А не какой попадется))
        musicShop.removeFromShowcase();
        musicShop.info();
    }
}
