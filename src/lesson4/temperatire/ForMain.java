package lesson4.temperatire;

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Enter Celcius degrees: ");
        double celcius = scaner.nextDouble();
        System.out.println(Temperature.fahrenheit(celcius));

        System.out.println("Enter Fahrenheit degrees: ");
        double fahrenheit = scaner.nextDouble();
        System.out.println(Temperature.celcius(fahrenheit));
    }
}
