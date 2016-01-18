package lesson8.flowerBouquet;

import java.util.ArrayList;
import java.util.Arrays;

public class Bouquet {
    public String name;
    Flower[] flowers = {};
    ArrayList<Flower> flowersList;

    public Bouquet(String name, Flower flower) {
        this.name = name;
        this.flowersList = new ArrayList<>(Arrays.asList(flowers));
        this.flowersList.add(flower);
    }

    public void addFlower(Flower flower) {
        this.flowersList.add(flower);
    }

    public void removeFlower() {
        flowersList.remove(flowersList.size() - 1);
    }

    public void info() {
        System.out.println(name + " contains from: ");
        flowersList
                .forEach(System.out::println);
    }
}
