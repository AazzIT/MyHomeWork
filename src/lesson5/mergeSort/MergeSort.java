package lesson5.mergeSort;

public class MergeSort {
    public static int[] mergeSort(int[] array) {
        if(array.length != 1) {
            int mid = array.length/2;
            int[] arrayA = new int[mid];
            int[] arrayB = new int[array.length - arrayA.length];

            for (int i = 0; i < array.length; i++) {
                if (i < mid) {
                    arrayA[i] = array[i];
                } else {
                    arrayB[i - mid] = array[i];
                }
            }
            arrayA = mergeSort(arrayA);
            arrayB = mergeSort(arrayB);
            array = merge(arrayA, arrayB);
            return array;
        }
        return array;
    }

    public static int[] merge(int[] arrayA, int[] arrayB) {
        int[] array = new int[arrayA.length + arrayB.length];
        int n = 0;
        int m = 0;
        for(int i = 0; i < array.length; i++) {
            if (n==arrayA.length) {//между операндом и оператором плиз пробел
                array[i] = arrayB[m];
                m++;
            } else if(m==arrayB.length) {
                array[i] = arrayA[n];
                n++;
            } else if(arrayA[n]>arrayB[m]) {
                array[i] = arrayB[m];
                m++;
            } else {
                array[i] = arrayA[n];
                n++;
            }
        }
        return array;
    }

    //как-то ты нестандартно решил этот алгоритм)))
    //ты используешь слишком много временных массивов, они при каждом заходе рекурсии создаются и создаются - это все память.
    //поищи, как еще можно этот метод сортировки сделать более выгодным по производительности и меньше занимает памяти.
    //подсказка - используй индексы массива, чтобы оперировать, каким диапазоном массива ты сейчас занимаешься.
}
