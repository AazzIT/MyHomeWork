package lesson4.calculateSquares;

import static java.lang.Math.*;

public class GeometricFigures {
    private double triangleSide1;
    private double triangleSide2;
    private double triangleSide3;
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

    public double getTriangleSide2() {
        return triangleSide2;
    }

    public void setTriangleSide2(double triagleSide2) {
        this.triangleSide2 = triagleSide2;
    }

    public double getTriangleSide3() {
        return triangleSide3;
    }

    public void setTriangleSide3(double triagleSide3) {
        this.triangleSide3 = triagleSide3;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double triangleSquare() {
        double p = (getTriangleSide1() + getTriangleSide2() + getTriangleSide3()) / 2;
        return sqrt(p * (p - getTriangleSide1()) * (p - getTriangleSide2()) * (p - getTriangleSide3()));
    }

    public double rectangleSquare() {
        return getRectangleHorizontalSide() * getRectangleVerticalSide();
    }

    public double circleSquare() {
        return PI * pow(getCircleRadius(), 2);
    }
}
