package lesson4.temperatire;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {

    @Test
    public void testToFahrenheit() throws Exception {
        final double celsius = 20;
        final double fahrenheit = Temperature.toFahrenheit(celsius);
        Assert.assertEquals(68, fahrenheit, 0);
    }

    @Test
    public void testToCelsius() throws Exception {
        final double fahrenheit = 68;
        final double celsius = Temperature.toCelsius(fahrenheit);
        Assert.assertEquals(20, celsius, 0);
    }
}