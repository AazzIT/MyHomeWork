package lesson8.flowerBouquet;

import java.util.ArrayList;
import java.util.Arrays;

public class Rosebush {
    Flower[] flowers = {};
    ArrayList<Flower> flowersList;

    public Rosebush() {
        this.flowersList = new ArrayList<>(Arrays.asList(flowers));
    }

    public void include(Flower rose) {
        this.flowersList.add(rose);
    }

    public void info() {
        if (flowersList.size() > 0) {
            System.out.println("Rosebush contains from: ");
            flowersList
                    .forEach(System.out::println);
        } else {
            System.out.println("Rosebush not contains Roses");
        }
    }
}
