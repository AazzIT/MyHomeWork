package lesson3.flowerBouquet;

public abstract class Flower {
    public Bouquet bouquet;
    public String name;
    public String color;

    public abstract void addBouquet(Bouquet bouquet);
    public abstract void info();
}
