package lesson7.lesson6AntiPattern.flowerBouquet;

public class ForMain {
    public static final String COLOR_RED = "red";
    public static final String COLOR_WHITE = "white";
    public static final String COLOR_YELLOW = "yellow";
    public static final String WITH_SPIKE = "with spike";
    public static final String BOUQUET_NAME = "Bouquet";

    public static void main(String[] args)  {
        //Create Flowers
        Rose roseOne = new Rose(COLOR_RED,WITH_SPIKE);
        Rose roseTwo = new Rose(COLOR_RED,WITH_SPIKE);
        Rose roseThree = new Rose(COLOR_RED,WITH_SPIKE);
        Flower aster = new Aster(COLOR_WHITE);
        Flower tulip = new Tulip(COLOR_YELLOW);
        Flower chamomile = new Chamomile(COLOR_WHITE);
        //Add flower to Bouquet
        Bouquet bouquet = new Bouquet(BOUQUET_NAME, roseOne);
        try {
            bouquet.addFlower(roseThree);
            bouquet.addFlower(aster);
            bouquet.addFlower(chamomile);
            bouquet.addFlower(tulip);
            //Print info about Bouquet
            System.out.println(bouquet);
        } catch (FullBouquetException e1) {
            System.out.println("\n" + e1.getMessage());
        }
        //Add rose to Rosebush
        Rosebush rosebush = new Rosebush();
        rosebush.include(roseOne);
        rosebush.include(roseTwo);
        rosebush.include(roseThree);
        //Print info about Rosebush
        System.out.println(rosebush);
        //Try call IllegalStateException
        Flower aster2 = new Aster(COLOR_WHITE);
        try {
            bouquet.addFlower(aster2);
        } catch (FullBouquetException e1) {
            System.out.println("\n" + e1.getMessage());
        }
        try {
            System.out.println(bouquet);
        } catch (IllegalStateException ex) {
            System.out.println("\n" + ex.getMessage());
        }
        //Try call FullBouquetException
        try {
            for (int i = 0; i <= 11; i++) {
                bouquet.addFlower(new Aster(COLOR_YELLOW));
            }
        } catch (FullBouquetException e) {
            System.out.println("\n" + e.getMessage());
        }


    }
}
