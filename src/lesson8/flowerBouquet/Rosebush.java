package lesson8.flowerBouquet;

import java.util.ArrayList;

public class Rosebush {
    private ArrayList<Rose> flowersList;

    public Rosebush() {
        this.flowersList = new ArrayList<>();
    }

    public void include(Rose rose) {
        this.flowersList.add(rose);
    }

    public String info() {
        String returnString;
        if (flowersList.size() > 0) {
            returnString = "Rosebush contains from: ";
            for (Rose rose : flowersList) {
                returnString += "\n" + rose.toString();
            }
        } else {
            returnString = "Rosebush not contains Roses";
        }
        return returnString;
    }
}
