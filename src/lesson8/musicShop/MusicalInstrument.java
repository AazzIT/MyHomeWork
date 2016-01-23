package lesson8.musicShop;

public class MusicalInstrument {
    public String name;

    public void info() {
        System.out.println("   " + name);
    } //по сути методы info и toString выполняют одну функцию. Можно лишнее убрать.

    @Override
    public String toString() {
        return "MusicalInstrument{" +
                "name='" + name + '\'' +
                '}';
    }
}
