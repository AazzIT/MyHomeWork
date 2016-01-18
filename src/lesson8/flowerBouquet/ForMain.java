package lesson8.flowerBouquet;

public class ForMain {
    public static final String COLOR_RED = "red";
    public static final String COLOR_WHITE = "white";
    public static final String COLOR_YELLOW = "yellow";
    public static final String WITH_SPIKE = "with spike";
    public static final String WITHOUT_SPIKE = "without spike";

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet("Bouquet", new Rose(COLOR_RED,WITH_SPIKE));
        bouquet.addFlower(new Rose(COLOR_RED,WITH_SPIKE));
        bouquet.addFlower(new Rose(COLOR_RED,WITH_SPIKE));
        bouquet.addFlower(new Aster(COLOR_WHITE));
        bouquet.addFlower(new Tulip(COLOR_YELLOW));
        bouquet.info();

        bouquet.removeFlower();
        bouquet.removeFlower();
        bouquet.info();

        Rosebush rosebush = new Rosebush();
        rosebush.include(new Rose(COLOR_WHITE,WITHOUT_SPIKE));
        rosebush.include(new Rose(COLOR_WHITE,WITHOUT_SPIKE));
        rosebush.include(new Rose(COLOR_WHITE,WITHOUT_SPIKE));
        rosebush.info();
    }
}
