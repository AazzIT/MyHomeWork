package lesson8.flowerBouquet;

import java.util.ArrayList;

public class Rosebush {
    private ArrayList<Rose> rosesList; //Полиморфизм List<>

    public Rosebush() {
        this.rosesList = new ArrayList<>();
    }

    public void include(Rose rose) {
        this.rosesList.add(rose);
    }

    public String info() {
        String returnString;
        if (rosesList.size() > 0) {
            returnString = "Rosebush contains from: ";
            for (Rose rose : rosesList) {
                returnString += "\n" + rose.toString();
            }
        } else {
            returnString = "Rosebush not contains Roses";
        }
        return returnString;
    }
}
