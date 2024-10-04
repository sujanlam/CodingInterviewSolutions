package arrays;

import java.util.Map;

public class LootingWays {
    public static void main(String[] args) {
        int[] nums = {6,5,5,7,4};
        int[] nums1 = {1,5,3};
        System.out.println(getWeirdWays(nums));
        System.out.println(getWeirdWays(nums1));
    }
    public static int getWeirdWays(int[] arr) {
        int sumOdd = 0;
        int sumEven = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i+=2) {
            sumOdd += arr[i];
        }
        for (int i = 1; i < arr.length; i+=2) {
            sumEven += arr[i];
        }
        return Math.max(sumOdd, sumEven);
    }
}
