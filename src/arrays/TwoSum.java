package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 22;
        int[] res = twoSum(nums, target);
        for (int i: res){
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int next = target - nums[i]; //2
            if (numsMap.containsKey(next)) {
                return new int[]{i, numsMap.get(next)};
            } else {
                numsMap.put(nums[i], i);
            }
        }
        return null;
    }
}
