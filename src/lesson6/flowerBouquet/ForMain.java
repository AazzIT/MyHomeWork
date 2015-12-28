package lesson6.flowerBouquet;

public class ForMain {
    public static void main(String[] args)  {
        //Create Flowers
        Rose roseOne = new Rose("red","with spike");
        Rose roseTwo = new Rose("red","with spike");
        Rose roseThree = new Rose("red","with spike");
        Flower aster = new Aster("white");
        Flower tulip = new Tulip("yellow");
        Flower chamomile = new Chamomile("white");
        //Add flower to Bouquet
        Bouquet bouquet = new Bouquet("Bouquet", roseOne);
        try {
            bouquet.addFlower(roseThree);
            bouquet.addFlower(aster);
            bouquet.addFlower(chamomile);
            bouquet.addFlower(tulip);
            //Print info about Bouquet
            bouquet.getInfo();
        } catch (FullBouquetException e1) {
            System.out.println("\n" + e1.getMessage());
        }
        //Add rose to Rosebush
        Rosebush rosebush = new Rosebush();
        rosebush.include(roseOne);
        rosebush.include(roseTwo);
        rosebush.include(roseThree);
        //Print info about Rosebush
        rosebush.info();
        //Try call IllegalStateException
        Flower aster2 = new Aster("white");
        try {
            bouquet.addFlower(aster2);
        } catch (FullBouquetException e1) {
            System.out.println("\n" + e1.getMessage());
        }
        try {
            bouquet.getInfo();
        } catch (IllegalStateException ex) {
            System.out.println("\n" + ex.getMessage());
        }
        //Try call FullBouquetException
        try {
            for (int i = 0; i <= 11; i++) {
                bouquet.addFlower(new Aster("Yellow"));
            }
        } catch (FullBouquetException e) {
            System.out.println("\n" + e.getMessage());
        }


    }
}
