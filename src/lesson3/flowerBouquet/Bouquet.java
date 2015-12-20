package lesson3.flowerBouquet;

public class Bouquet {
    public String name;
    public Flower[] flowers;
    private int count;

    public Bouquet(String name, Flower flower) {
        this.name = name;
        this.flowers = new Flower[10];
        this.flowers[0] = flower;
        count = 1;
    }

    public void addFlower(Flower flower) {
        this.flowers[count] = flower;
        count++;
    }

    public void getInfo() {
        System.out.println(name + " contain from: ");
        for(int i = 0; i <= count  - 1; i++) { //в другом классе у тебя более элегантный счетчик цикла
            flowers[i].info();
        }
        System.out.println("\r\n");
    }
}
