package lesson7.lesson6AntiPattern.flowerBouquet;

public class Rosebush {
    public static final int ROSE_COUNT = 10;
    public Rose[] rose;
    private int count;

    public Rosebush() {
       rose = new Rose[ROSE_COUNT];
    }

    public void include(Rose rose) {
        this.rose[count + 1] = rose;
        count++;
    }

    @Override
    public String toString() {
        if (count > 0) {
            return "Rosebush contains " + count + " roses color: " + rose[count].color + " " + rose[count].spike;
        } else {
            return "Rosebush not contains Roses";
        }
    }
}
