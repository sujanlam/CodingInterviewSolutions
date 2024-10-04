package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindSecondLargestNun {
    public static void main(String[] args) {
        int[] nums = {32, 3,2,27,9,1,4,11, 33, 7};
        int k = 3;
        System.out.println(findSecondLargest(nums, k));
        System.out.println(findSecondSmallest(nums, k));
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static int findSecondLargest(int[] nums, int k) {
        int num = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static int findSecondSmallest(int[] nums, int k) {
        int num = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

}
