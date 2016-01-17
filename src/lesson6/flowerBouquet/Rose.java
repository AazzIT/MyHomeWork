package lesson6.flowerBouquet;

public class Rose extends Flower {
    public String spike;
    public static final String ROSE_NAME = "Rose";

    public Rose(String color, String spike) {
        super.name = ROSE_NAME; //хардкод
        super.color = color;
        this.spike = spike;
    }
}
