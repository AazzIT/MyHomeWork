package lesson3.flowerBouquet;

public class Rosebush {
    public Rose[] rose;
    int count;

    public Rosebush() {
       rose = new Rose[10];
       count = 0; //можно не инициировать нулем, поле класса по умолчанию будет ноль.
    }

    public void addRose(Rose rose) {
        this.rose[count+1] = rose;
        count++;
    }

    public void info() {
        if (count > 0) {
            System.out.println("Rosebush contain " + count + " roses color: " + rose[count].color + " " + rose[count].spike);
        } else {
            System.out.println("Rosebush not contain Roses");
        }
    }
}
