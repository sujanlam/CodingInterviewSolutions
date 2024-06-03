package arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        //int[] nums = {-1};
        System.out.println(findMaxAverage(nums, 4));
        findMaxAverage(nums, 4);
    }

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        //Lets calculate sum from 0 till k elements
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        //Assign sum to maxSum
        double maxSum = sum;
        /*Let's iterate from k+1 till the end of array
        add kth item and remove the item up front so that we only get
        k number of elements.*/
        for(int i=k; i<nums.length; i++){
            sum += nums[i]-nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum/k;
    }
}
