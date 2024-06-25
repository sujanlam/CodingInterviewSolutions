package sortingalgos.inefficient;

import utils.Display;

public class BubbleSort {
    public static void main(String[] args) {
        Display<Integer> display1 = new Display<>();
        int[] array = {11, 2, 43, 8, 16, 32, 64, 12, 25, 5, 14};
        display1.displayArr(array);
        System.out.println();
        int[] sortedArr = sortUsingBubbleShort(array);
        display1.displayArr(sortedArr);
    }

    private static int[] sortUsingBubbleShort(int[] array) {
        int n = array.length;
        boolean swapped = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] < array[j+1]) {
                    swap(array, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
        return array;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
