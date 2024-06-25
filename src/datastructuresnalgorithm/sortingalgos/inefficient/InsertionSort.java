package sortingalgos.inefficient;

import utils.Display;

public class InsertionSort {
    public static void main(String[] args) {
        Display<Integer> display1 = new Display<>();
        int[] array = {11, 2, 43, 8, 16, 32, 64, 12, 25, 5, 14};
        display1.displayArr(array);
        System.out.println();
        int[] soretedUsingSelectionSort = selSortNums(array);
        display1.displayArr(array);
    }

    private static int[] selSortNums(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
