package lesson4.distance;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceTest {

    @Test
    public void testDistance() throws Exception {
        double x1 = 3;
        double y1 = 4;
        double x2 = -3;
        double y2 = -4;
        final double result = Distance.distance(x1, y1, x2, y2);
        Assert.assertEquals(10, result, 0);
    }
}