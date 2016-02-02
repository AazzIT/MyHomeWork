package lesson5.searchMaxMin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchMaxMinTest {
    final int[] intArray = {10, 23, 45, 15, 99, 1, 100};

    @Test(timeout = 1000)
    public void testGetMaxElement() throws Exception {
        final int maxElement = SearchMaxMin.getMaxElement(intArray);
        Assert.assertEquals(100, maxElement);
    }

    @Test(timeout = 1000)
    public void testGetMinElement() throws Exception {
        final int minElement = SearchMaxMin.getMinElement(intArray);
        Assert.assertEquals(1, minElement);
    }
}