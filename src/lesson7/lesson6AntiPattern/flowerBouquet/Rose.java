package lesson7.lesson6AntiPattern.flowerBouquet;

public class Rose extends Flower {
    public String spike;
    public static final String ROSE_NAME = "Rose";

    public Rose(String color, String spike) {
        super.name = ROSE_NAME;
        super.color = color;
        this.spike = spike;
    }
}
