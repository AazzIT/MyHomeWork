package lesson8.flowerBouquet;

import java.util.ArrayList;
import java.util.Arrays;

public class Rosebush {
    Flower[] flowers = {}; //что-то у тебя во всех классах потерялась инкапсуляция на поля класса.. Все нужно private, или
    //в крайнем случае protected
    ArrayList<Flower> flowersList;

    public Rosebush() {
        this.flowersList = new ArrayList<>(Arrays.asList(flowers));
    } //зачем нужен массив, который ты
    //тут же переносишь в лист?

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

    //Потеряла логику. У тебя есть куст роз, который зачем-то добавляет входящие извне розы в лист цветов.
    //По-моему, куст роз содержит розы, класс цветок тут не должен фигурировать.
}
