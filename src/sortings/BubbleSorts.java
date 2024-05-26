package com.codes.sortings;

public class BubbleSorts {


    public static void main(String[] args) {
        int[] nums = {54, 24, 15, 2, 1, 80};
        System.out.println("Before Sorting: ");
        printArr(nums);
        bubbleSorted(nums);
        System.out.println("\nAfter Sortings: ");
        printArr(nums);
    }

    private static void bubbleSorted(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    swap(nums, i, j);
                }
            }

        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    static void printArr(int[] nums) {
        for (int num: nums) {
            System.out.print(num+"  ");
        }
    }
}
