package lesson4.calculateSquares;

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        GeometricFigures figures = new GeometricFigures();

        System.out.println("Enter first side of Triangle: ");
        figures.setTriagleSide1(scaner.nextDouble());
        System.out.println("Enter second side of Triangle: ");
        figures.setTriagleSide2(scaner.nextDouble());
        System.out.println("Enter third side of Triangle: ");
        figures.setTriagleSide3(scaner.nextDouble());
        System.out.println("Triagle square is: " + figures.triagleSquare());

        System.out.println("Enter rectangle horizontal side: ");
        figures.setRectangleHorizontalSide(scaner.nextDouble());

        System.out.println("Enter rectangle vertical side: ");
        figures.setRectangleVerticalSide(scaner.nextDouble());
        System.out.println("Rectangle square is: " + figures.rectangleSquare());

        System.out.println("Enter circle radius: ");
        figures.setCircleRadius(scaner.nextDouble());
        System.out.println("Circle square is: " + figures.circleSquare() + "\n");
    }
}
