package lesson8.flowerBouquet;

import java.util.ArrayList;

public class Bouquet {
    private String name;
    private ArrayList<Flower> flowersList;

    public Bouquet(String name, Flower flower) {
        this.name = name;
        this.flowersList = new ArrayList<>();
        this.flowersList.add(flower);
    }

    public void addFlower(Flower flower) {
        this.flowersList.add(flower);
    }

    public void removeFlower() {
        flowersList.remove(flowersList.size() - 1);
    }

    public String info() {
        String returnString;
        returnString = name + " contains from: ";
        for (Flower flower : flowersList) {
            returnString += "\n" + flower.toString();
        }
        return returnString;
    }
}
