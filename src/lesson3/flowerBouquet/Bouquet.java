package lesson3.flowerBouquet;

public class Bouquet {
    public String name;
    public String flowers; // было бы логичней цветы собирать в массив Flower[]

    public Bouquet(String name) {
        this.name = name;
        flowers = "";//по умолчанию стринговое поле класса инициализируется как null
    }

    public void addFlower(String flower) {
        flowers = this.flowers + "\r\n " + flower;
    }

    public void info() {
        System.out.println(name);
        System.out.println("Contains from: " + flowers);
    }
}
