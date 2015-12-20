package lesson3.flowerBouquet;

public class ForMain {
    public static void main(String[] args) {
        //Create Flowers
        Rose roseOne = new Rose("red","with spike");//розы тоже цветы, обделил полиморфизмом))
        Rose roseTwo = new Rose("red","with spike");
        Rose roseThree = new Rose("red","with spike");
        Flower aster = new Aster("white");
        Flower tulip = new Tulip("yellow");
        Flower chamomile = new Chamomile("white");
        //Add flower to Bouquet
        Bouquet bouquet = new Bouquet("Bouquet", roseOne);
        bouquet.addFlower(roseThree);
        bouquet.addFlower(aster);
        bouquet.addFlower(chamomile);
        bouquet.addFlower(tulip);
        //Print info about Bouquet
        bouquet.info();
        //Add rose to Rosebush
        Rosebush rosebush = new Rosebush();
        rosebush.include(roseOne);
        rosebush.include(roseTwo);
        rosebush.include(roseThree);
        //Print info about Rosebush
        rosebush.info();
    }
}
