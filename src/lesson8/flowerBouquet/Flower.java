package lesson8.flowerBouquet;

public class Flower {
    protected String name;
    protected String color;

    @Override
    public String toString() {
        return "Flower {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
