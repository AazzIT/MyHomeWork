package lesson5.mergeSort;

public class MergeSort {
    public static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    public static void mergeSort(int[] array, int lo, int hi) {
        if (hi > lo) {
            int mid = lo + (hi - lo) / 2;
            mergeSort(array, lo, mid);
            mergeSort(array, mid + 1, hi);
            merge(array, lo, mid, hi);
        }
    }

    private static void merge(int[] array, int lo, int mid, int hi) {
        int[] tempArray = array.clone();
        int i = lo;
        int j = mid + 1;
        for (int n = lo; n <= hi; n++) {
            if (i > mid) {
                array[n] = tempArray[j++];
            } else if (j > hi) {
                array[n] = tempArray[i++];
            } else if (tempArray[i] > tempArray[j]) {
                array[n] = tempArray[j++];
            } else {
                array[n] = tempArray[i++];
            }
        }
    }
}
