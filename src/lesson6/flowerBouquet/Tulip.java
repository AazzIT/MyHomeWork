package lesson6.flowerBouquet;

public class Tulip extends Flower {
    public static final String TULIP_NAME = "Tulip";

    public Tulip(String color) {
        super.name = TULIP_NAME; //Хардкод
        super.color = color;
    }
}
