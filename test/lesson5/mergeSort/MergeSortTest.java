package lesson5.mergeSort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test(timeout = 3000)
    public void testMergeSort() throws Exception {
        final int[] arrayForSort =  {72, 80, 37, 25, 17, 20, 5, 80, 59, 89, 4, 10, 17, 67, 57, 95, 70, 98, 25, 55};
        final int[] arrayAfterSort =  {4, 5, 10, 17, 17, 20, 25, 25, 37, 55, 57, 59, 67, 70, 72, 80, 80, 89, 95, 98};
        MergeSort.mergeSort(arrayForSort);
        Assert.assertArrayEquals(arrayAfterSort, arrayForSort);
    }
}