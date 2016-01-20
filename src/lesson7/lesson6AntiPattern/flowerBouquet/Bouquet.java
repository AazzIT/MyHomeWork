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

    @Override
    public String toString() {
        String result;
        if (count % 2 == 1) {
            result = name + " contain from: ";
            for (int i = 0; i <= count - 1; i++) {
                result += "\r\n" + flowers[i];
            }
        } else {
            throw new IllegalStateException("[Warning]: Bouquet can not contain even number of flowers!");
        }
        return result + "\r\n";
    }
}
