package lesson8.flowerBouquet;

public class ForMain {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet("Bouquet", new Rose("red","with spike"));
        bouquet.addFlower(new Rose("red","with spike"));
        bouquet.addFlower(new Rose("red","with spike"));
        bouquet.addFlower(new Aster("white"));
        bouquet.addFlower(new Tulip("yellow"));
        bouquet.info();

        bouquet.removeFlower();
        bouquet.removeFlower();
        bouquet.info();

        Rosebush rosebush = new Rosebush();
        rosebush.include(new Rose("white","without spike"));
        rosebush.include(new Rose("white","without spike"));
        rosebush.include(new Rose("white","without spike"));
        rosebush.info();
    }
}
