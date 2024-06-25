package sortingalgos.efficient;

import utils.Display;

public class MergeSort {
    public static void main(String[] args) {
        Display<Integer> dis = new Display<>();
        int[] array = {11, 2, 43, 8, 16, 32, 64, 12, 25, 5, 14};
        dis.displayArr(array);
        System.out.println();
        int[] sorted = sortUsingMergesort(array);
        dis.displayArr(sorted);
    }

    private static int[] sortUsingMergesort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return nums;
        }
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int j = 0; //for right array

        for (int i = 0; i < length; i++) {
            if (i < middle) {
                leftArray[i] = nums[i];
            } else {
                rightArray[j] = nums[i];
                j++;
            }
        }
        sortUsingMergesort(leftArray);
        sortUsingMergesort(rightArray);
        merge(leftArray, rightArray, nums);
        return nums;
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0;
        int l = 0;
        int r = 0;
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            } else {
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            l++;
            i++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            r++;
            i++;
        }

    }
}
