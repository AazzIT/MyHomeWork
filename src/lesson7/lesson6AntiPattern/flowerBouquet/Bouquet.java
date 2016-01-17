package lesson7.lesson6AntiPattern.flowerBouquet;

public class Bouquet {
    private String name;
    private Flower[] flowers;
    private int count;

    public Bouquet(String name, Flower flower) {
        this.name = name;
        this.flowers = new Flower[10];
        this.flowers[0] = flower;
        count = 1;
    }

    public void addFlower(Flower flower) throws FullBouquetException {
        try {
            this.flowers[count++] = flower;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new FullBouquetException("[Error]: Bouquet is Full!");
        }
    }

    public void info() {
        if (count % 2 == 1) {
            System.out.println(name + " contain from: ");
            for (int i = 0; i <= count - 1; i++) {
                flowers[i].info();
            }
        } else {
            throw new IllegalStateException("[Warning]: Bouquet can not contain even number of flowers!");
        }
        System.out.println("\r\n");
    }
}
