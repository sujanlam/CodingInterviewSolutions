package sortingalgos.inefficient;

import utils.Display;

public class SelectionSort extends Display {
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
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(array[j] < array[min]){
                    min = j;
                }
            }
            swap(array, min, i);
        }
        return array;
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
