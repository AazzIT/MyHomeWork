package lesson3.flowerBouquet;

public class ForMain {
    public static void main(String[] args) {
        //Create Flowers
        Rose roseOne = new Rose("red","with spike"); //Тут можно применить полиморфизм Flower roseOne = new Rose();
        Rose roseTwo = new Rose("red","with spike");
        Rose roseThree = new Rose("red","with spike");
        Aster aster = new Aster("white");
        Tulip tulip = new Tulip("yellow");
        Chamomile chamomile = new Chamomile("white");
        //Add flower to Bouquet
        Bouquet bouquet = new Bouquet("Bouquet");
        roseOne.addBouquet(bouquet); // вот тут вышла логика наоборот. Надо в букет добавлять цветок. Значит у объекта букет вызвать метод добавить цветок.
        roseThree.addBouquet(bouquet);
        aster.addBouquet(bouquet);
        tulip.addBouquet(bouquet);
        chamomile.addBouquet(bouquet);
        //Print info about Bouquet
        bouquet.info();
        //Add rose to Rosebush
        Rosebush rosebush = new Rosebush();
        rosebush.addRose(roseOne); // в куст нельзя добавть цветок, он сам растет))). Можно переименовать метод, чтобы было реальней.
        rosebush.addRose(roseTwo);
        rosebush.addRose(roseThree);
        //Print info about Rosebush
        rosebush.info();
    }
}
