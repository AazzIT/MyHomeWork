package lesson4.calculateSquares;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeometricFiguresTest {
    private GeometricFigures figures;

    @Before
    public void setUp() {
        figures = new GeometricFigures();
    }

    @Test(timeout = 1000)
    public void testTriangleSquare() throws Exception {
        figures.setTriangleSide1(3);
        figures.setTriangleSide2(4);
        figures.setTriangleSide3(5);
        double result = figures.triangleSquare();
        Assert.assertEquals(6.000, result, 0.001); //о чем нам говорит третий параметр - дельта?
        // О точности сравнения двух вещественных чисел
    }

    @Test(timeout = 1000)
    public void testRectangleSquare() throws Exception {
        figures.setRectangleHorizontalSide(3);
        figures.setRectangleVerticalSide(3);
        final double result = figures.rectangleSquare();
        Assert.assertEquals(9.000, result, 0.001);
    }

    @Test(timeout = 1000)
    public void testCircleSquare() throws Exception {
        figures.setCircleRadius(100);
        final double result = figures.circleSquare();
        Assert.assertEquals(31415.9, result, 0.1);
    }
}