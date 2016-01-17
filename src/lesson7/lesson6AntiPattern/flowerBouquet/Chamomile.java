package lesson7.lesson6AntiPattern.flowerBouquet;

public class Chamomile extends Flower {
    public static final String CHAMOMILE_NAME = "Chamomile";

    public Chamomile(String color) {
        super.name = CHAMOMILE_NAME; //хардкод
        super.color = color;
    }
}
