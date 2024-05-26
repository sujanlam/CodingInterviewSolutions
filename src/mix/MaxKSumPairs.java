package mix;

import java.util.HashMap;
import java.util.Map;

public class MaxKSumPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums1 = {3,1,3,4,3};
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> mapp = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int nextNum = k - nums[i];

            if (!mapp.containsKey(nextNum)) {
                mapp.put(nums[i], mapp.getOrDefault(nums[i], 0) + 1);
            } else {
                mapp.put(nextNum, mapp.getOrDefault(nextNum, 0) - 1);
                if (mapp.get(nextNum) == 0) {
                    mapp.remove(nextNum);

                }
                count++;
            }
        }

        return count;
    }
}
