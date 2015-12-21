package lesson4.calculateSquares;

import static java.lang.Math.*;

public class GeometricFigures {
    private double triangleSide1;
    private double triagleSide2;
    private double triagleSide3;
    private double rectangleHorizontalSide;
    private double rectangleVerticalSide;
    private double circleRadius;

    public double getRectangleHorizontalSide() {
        return rectangleHorizontalSide;
    }

    public void setRectangleHorizontalSide(double rectangleHorizontalSide) {
        this.rectangleHorizontalSide = rectangleHorizontalSide;
    }

    public double getRectangleVerticalSide() {
        return rectangleVerticalSide;
    }

    public void setRectangleVerticalSide(double rectangleVerticalSide) {
        this.rectangleVerticalSide = rectangleVerticalSide;
    }

    public double getTriangleSide1() {
        return triangleSide1;
    }

    public void setTriangleSide1(double triangleSide1) {
        this.triangleSide1 = triangleSide1;
    }

    public double getTriagleSide2() {
        return triagleSide2;
    }

    public void setTriagleSide2(double triagleSide2) {
        this.triagleSide2 = triagleSide2;
    }

    public double getTriagleSide3() {
        return triagleSide3;
    }

    public void setTriagleSide3(double triagleSide3) {
        this.triagleSide3 = triagleSide3;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double triagleSquare() {
        double p = (getTriangleSide1() + getTriagleSide2() + getTriagleSide3()) / 2;
        return sqrt(p * (p - getTriangleSide1()) * (p - getTriagleSide2()) * (p - getTriagleSide3()));
    }

    public double rectangleSquare() {
        return getRectangleHorizontalSide() * getRectangleVerticalSide();
    }

    public double circleSquare() {
        return PI * pow(getCircleRadius(), 2);
    }
}
