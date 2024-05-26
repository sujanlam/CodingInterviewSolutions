package mix;

import java.util.ArrayList;
import java.util.List;

public class DistributeArraysIntoTwo {
    public static void main(String[] args) {
        int[] nums = {5,4,3,8};
        int[] res = resultArray(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);

        for (int i=2; i<n; i++){
            if(l1.get(l1.size()-1) > l2.get(l2.size()-1)){
                l1.add(nums[i]);
            }else {
                l2.add(nums[i]);
            }
        }
        int l2Indx = 0;
        for (int i = 0; i < n; i++) {
            if(i < l1.size()){
                nums[i] = l1.get(i);
            }else {
                nums[i] = l2.get(l2Indx);
                l2Indx++;
            }
        }
        return nums;
    }
}
