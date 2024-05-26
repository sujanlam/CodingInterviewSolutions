package com.codes.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {4,100, 200, 1, 6, 201, 3, 5, 2};
        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        int longestCount = 0;

        Set<Integer> setNumbers = new HashSet<>();
        for (int num : nums) {
            setNumbers.add(num);
        }
        System.out.println(setNumbers);

        for (int n : setNumbers) {
            if (!setNumbers.contains(n - 1)) {
                int count = 1;
                while (setNumbers.contains(n + 1)) {
                    n++;
                    count++;
                }
                longestCount = Math.max(count, longestCount);
            }
        }

        return longestCount;
    }
}
