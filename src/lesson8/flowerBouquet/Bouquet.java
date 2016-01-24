package lesson8.flowerBouquet;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private String name;
    private List<Flower> flowersList;

    public Bouquet(String name, Flower flower) {
        this.name = name;
        this.flowersList = new ArrayList<>();
        this.flowersList.add(flower);
    }

    public void addFlower(Flower flower) {
        this.flowersList.add(flower);
    }

    public String info() {
        String returnString = name + " contains from: ";
        for (Flower flower : flowersList) {
            returnString += "\n" + flower.toString();
        }
        return returnString;
    }
}
