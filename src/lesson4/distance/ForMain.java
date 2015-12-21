package lesson4.distance;

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2: ");
        double x1 = scaner.nextDouble();
        double y1 = scaner.nextDouble();
        double x2 = scaner.nextDouble();
        double y2 = scaner.nextDouble();

        System.out.print("Distance between two point equals: ");
        System.out.println(Distance.distance(x1, y1, x2, y2));
    }
}