package lesson3.flowerBouquet;

public class Tulip extends Flower {
    public Tulip(String color) {
        super.name = "Tulip";
        super.color = color;
    }

    public void addBouquet(Bouquet bouquet){
        super.bouquet = bouquet;
        bouquet.addFlower("bouquet");
    }

    public void info() {
        System.out.println("Flower " + name+ " color:" + color);
    }
}
