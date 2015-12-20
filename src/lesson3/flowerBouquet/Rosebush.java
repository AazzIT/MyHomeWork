package lesson3.flowerBouquet;

public class Rosebush {
    public Rose[] rose;
    private int count;

    public Rosebush() {
       rose = new Rose[10];
    }

    public void include(Rose rose) {
        this.rose[count + 1] = rose;
        count++;
    }

    public void info() {
        if (count > 0) {
            System.out.println("Rosebush contains " + count + " roses color: " + rose[count].color + " " + rose[count].spike);
        } else {
            System.out.println("Rosebush not contains Roses");
        }
    }
}
