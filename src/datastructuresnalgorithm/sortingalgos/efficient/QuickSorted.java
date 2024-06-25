package sortingalgos.efficient;

import utils.Display;

public class QuickSorted {
    public static void main(String[] args) {
        Display<Integer> dis = new Display<>();
        int[] array = {11, 2, 43, 8, 16, 32, 64, 12, 25, 5, 14};
        dis.displayArr(array);
        System.out.println();
        sortUsingMergesort(array, 0, array.length-1);
        dis.displayArr(array);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        //Check to see if num[j] is smaller than pivot, if so increment i and swap i & j
        //else increment j
        for (int j = start; j <= end - 1; j++) {
                if (array[j] < pivot) {
                    i++;
                    swap(array, i, j);
                }
            }
            i++;
            swap(array, i, end);

        return i;
    }

    private static void sortUsingMergesort(int[] array, int start, int end) {
        if (end <= start) {
            return;
        }
        int pivot = partition(array, start, end);
        sortUsingMergesort(array, start, pivot - 1);
        sortUsingMergesort(array, pivot + 1, end);
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
