package lesson5.mergeSort;

public class ForMain {
    public static void main(String[] args) {
        int[] array = new int[20];

        System.out.println("Array before sorting: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        array = MergeSort.mergeSort(array);

        System.out.println("\n\nArray after sorting: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}