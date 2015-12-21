package lesson4.calculateSquares;

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner figuresSides = new Scanner(System.in); //сканнер лучше именовать сканнером, scan, scanner

        GeometricFigures figures = new GeometricFigures();

        System.out.println("Enter first side of Triangle: ");
        figures.setTriagleSide1(figuresSides.nextDouble());

        System.out.println("Enter second side of Triangle: ");
        figures.setTriagleSide2(figuresSides.nextDouble());

        System.out.println("Enter third side of Triangle: ");
        figures.setTriagleSide3(figuresSides.nextDouble()); //логичней сделать так: ввели три стороны треугольника, вывели площадь. потом след. фигуры

        System.out.println("Enter rectangle horizontal side: ");
        figures.setRectangleHorizontalSide(figuresSides.nextDouble());

        System.out.println("Enter rectangle vertical side: ");
        figures.setRectangleVerticalSide(figuresSides.nextDouble());

        System.out.println("Enter round radius: ");
        figures.setCircleRadius(figuresSides.nextDouble());

        System.out.println("\r\n");

        System.out.println("Rectangle square is: " + figures.rectangleSquare());
        System.out.println("Triagle square is: " + figures.triagleSquare());
        System.out.println("Circle square is: " + figures.circleSquare() + "\r\n");
    }
}
