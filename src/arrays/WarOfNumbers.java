package com.codes.arrays;

import java.util.Arrays;

public class WarOfNumbers {
    public static void main(String[] args) {
        int[] nums = {5,9,45,6,2,7,34,8,6,90,5,243};
        System.out.println(warOfNums(nums));
    }

    private static int warOfNums(int[] numbers) {
        /*int oddSum = Arrays.stream(nums).filter(num -> num %2==0).sum();
        int evenSum = Arrays.stream(nums).filter(num -> num %2 !=0).sum();
        return Math.abs(oddSum-evenSum);*/
        return Math.abs((Arrays.stream(numbers).filter(n -> n % 2 == 0).sum())
                - (Arrays.stream(numbers).filter(n -> n % 2 != 0).sum()));
    }

}
