package lesson7.lesson6AntiPattern.flowerBouquet;

public class Aster extends Flower {
    public static final String ASTER_NAME = "Aster";

    public Aster(String color) {
        super.name = ASTER_NAME; //хардкод
        super.color = color;
    }
}
