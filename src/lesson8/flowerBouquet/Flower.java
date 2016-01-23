package lesson8.flowerBouquet;

public class Flower {
    public String name; //Лучше бы хотя бы protected поля сделать
    public String color;

    @Override
    public String toString() {
        return "Flower {" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
