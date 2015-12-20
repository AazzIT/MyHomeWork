package lesson3.flowerBouquet;

public class Rose extends Flower {
    public String spike;
    public Rose(String color, String spike) {
        super.name = "Rose";
        super.color = color;
        this.spike = spike;
    }

    public void addBouquet(Bouquet bouquet){
        super.bouquet = bouquet;
        bouquet.addFlower("Rose");
    }

    public void info() { // если метод не используется - это мертвый код. Или используй, или удали.
        System.out.println("Flower " + name+ " color:" + color + " " + spike);
    }
}
