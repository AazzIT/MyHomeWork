package lesson3.flowerBouquet;

public class Aster extends Flower {
    public Aster(String color) {
        super.name = "Aster";
        super.color = color;
    }

    public void addBouquet(Bouquet bouquet){
        super.bouquet = bouquet;
        bouquet.addFlower("Aster");
    }

    public void info() {
        System.out.println("Flower: " + name+ " color:" + color);
    }
}
