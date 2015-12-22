package lesson5.searchMaxMin;

public class SearchMaxMin {
    public static int getMaxElement(int[] intArray) {
        int maxElement = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (maxElement < intArray[i]) {
                maxElement = intArray[i];
            }
        }
        return maxElement;
    }

    public static int getMinElement(int[] intArray) {
        int minElement = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (minElement > intArray[i]) {
                minElement = intArray[i];
            }
        }
        return minElement;
    }
}
