package lesson5.mergeSort;

public class MergeSort {
    public static void mergeSort(int[] array, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        mergeSort(array, lo, mid);
        mergeSort(array, mid + 1, hi);
        merge(array, lo, mid, hi);
    }

    private static void merge(int[] array, int lo, int mid, int hi) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        int i = lo;
        int j = mid + 1;
        for (int n = lo; n <= hi; n++) {
            if (i > mid) {
                array[n] = sortedArray[j++];
            } else if (j > hi) {
                array[n] = sortedArray[i++];
            } else if (sortedArray[i] > sortedArray[j]) {
                array[n] = sortedArray[j++];
            } else {
                array[n] = sortedArray[i++];
            }
        }
    }
}
