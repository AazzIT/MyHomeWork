package lesson4.calculateSquares;

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GeometricFigures figures = new GeometricFigures();

        System.out.println("Enter first side of Triangle: ");
        figures.setTriangleSide1(scanner.nextDouble());
        System.out.println("Enter second side of Triangle: ");
        figures.setTriangleSide2(scanner.nextDouble());
        System.out.println("Enter third side of Triangle: ");
        figures.setTriangleSide3(scanner.nextDouble());
        System.out.println("Triangle square is: " + figures.triangleSquare());

        System.out.println("Enter rectangle horizontal side: ");
        figures.setRectangleHorizontalSide(scanner.nextDouble());

        System.out.println("Enter rectangle vertical side: ");
        figures.setRectangleVerticalSide(scanner.nextDouble());
        System.out.println("Rectangle square is: " + figures.rectangleSquare());

        System.out.println("Enter circle radius: ");
        figures.setCircleRadius(scanner.nextDouble());
        System.out.println("Circle square is: " + figures.circleSquare() + "\n");
    }
}
