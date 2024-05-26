package arrays;

import java.util.Arrays;

public class ProductButSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = productButSelf(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    private static int[] productButSelf(int[] nums) {
        int leftProduct = 1;
        int rightProduct = 1;
        int n = nums.length;

        int[] res = new int[n];
        Arrays.fill(res, 1);

        for (int i = 0; i < n; i++) {
            res[i] *= leftProduct;
            leftProduct *= nums[i];
        }

        for (int i = n-1; i >= 0; i--) {
            res[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return res;
    }
}
