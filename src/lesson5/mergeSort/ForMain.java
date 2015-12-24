package lesson5.mergeSort;

import java.util.Random;

public class ForMain {
    public static void main(String[] args) {
        int[] array = new int[30];
        Random generator = new Random();

        System.out.println("Array before sorting: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(100);
            System.out.print(array[i] + " ");
        }

        MergeSort.mergeSort(array, 0, array.length - 1);

        System.out.println("\n\nArray after sorting: ");
        for (int arrElement:array) {
            System.out.print(arrElement + " ");
        }
    }
}
