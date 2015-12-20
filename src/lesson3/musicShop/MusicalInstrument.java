package lesson3.musicShop;

public class MusicalInstrument {
    public String name;
    public MusicShop shop; // опять выходит наоборот. Инструмент знает, в каком он магазине, а магазин не знает, какие в нем есть иструменты

    public void inShop(MusicShop shop) { //именование метода - первое слово глагол, действие.
        this.shop = shop;
    }

    public void info() {
        System.out.println(name + " sold in " + shop.name);
    }
}
