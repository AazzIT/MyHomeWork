package lesson8.musicShop;

public class MusicalInstrument {
    public String name;

    public void info() {
        System.out.println("   " + name);
    }

    @Override
    public String toString() {
        return "MusicalInstrument{" +
                "name='" + name + '\'' +
                '}';
    }
}
