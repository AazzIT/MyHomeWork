package lesson3.flowerBouquet;

public class Bouquet {
    public String name;
    public String flowers;

    public Bouquet(String name) {
        this.name = name;
        flowers = "";
    }

    public void addFlower(String flower) {
        flowers = this.flowers + "\r\n " + flower;
    }

    public void info() {
        System.out.println(name);
        System.out.println("Contains from: " + flowers);
    }
}
