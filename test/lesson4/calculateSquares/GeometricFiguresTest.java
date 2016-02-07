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
        final double result = figures.triangleSquare();//не соглашусь, зачем здесь делать переменную резалт файнал?
        //а если мы захотим поменять одну из сторон и пересчитать площадь?
        Assert.assertEquals(6, result, 0); //о чем нам говорит третий параметр - дельта?

    }

    @Test(timeout = 1000)
    public void testRectangleSquare() throws Exception {
        figures.setRectangleHorizontalSide(3);
        figures.setRectangleVerticalSide(3);
        final double result = figures.rectangleSquare();
        Assert.assertEquals(9, result, 0);
    }

    @Test(timeout = 1000)
    public void testCircleSquare() throws Exception {
        figures.setCircleRadius(100);
        final double result = figures.circleSquare();
        Assert.assertEquals(31415.9, result, 0.1);
    }
}