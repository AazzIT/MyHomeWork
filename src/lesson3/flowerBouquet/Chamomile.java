package lesson3.flowerBouquet;

public class Chamomile extends Flower {
    public Chamomile(String color) {
        super.name = "Chamomile";
        super.color = color;
    }

    public void addBouquet(Bouquet bouquet){
        super.bouquet = bouquet;
        bouquet.addFlower("Chamomile");
    }

    public void info() {
        System.out.println("Flower " + name+ " color:" + color);
    }
}
