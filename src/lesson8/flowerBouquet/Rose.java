package lesson8.flowerBouquet;

public class Rose extends Flower {
    public String spike;

    public Rose(String color, String spike) {
        super.name = "Rose";
        super.color = color;
        this.spike = spike;
    }

    @Override
    public String toString() {
        return "Flower {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", spike='" + spike + '\'' +
                '}';
    }
}
