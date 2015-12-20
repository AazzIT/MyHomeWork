package lesson3.flowerBouquet;

public class ForMain {
    public static void main(String[] args) {
        //Create Flowers
        Rose roseOne = new Rose("red","with spike");
        Rose roseTwo = new Rose("red","with spike");
        Rose roseThree = new Rose("red","with spike");
        Aster aster = new Aster("white");
        Tulip tulip = new Tulip("yellow");
        Chamomile chamomile = new Chamomile("white");
        //Add flower to Bouquet
        Bouquet bouquet = new Bouquet("Bouquet");
        roseOne.addBouquet(bouquet);
        roseThree.addBouquet(bouquet);
        aster.addBouquet(bouquet);
        tulip.addBouquet(bouquet);
        chamomile.addBouquet(bouquet);
        bouquet.info();
        //Add rose to Rosebush
        Rosebush rosebush = new Rosebush();
        rosebush.addRose(roseOne);
        rosebush.addRose(roseTwo);
        rosebush.addRose(roseThree);
        rosebush.info();
    }
}
