package lesson4.temperatire;

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Celsius degrees: ");
        double celsius = scanner.nextDouble();
        System.out.println(Temperature.toFahrenheit(celsius));

        System.out.println("Enter Fahrenheit degrees: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println(Temperature.toCelsius(fahrenheit));
    }
}
