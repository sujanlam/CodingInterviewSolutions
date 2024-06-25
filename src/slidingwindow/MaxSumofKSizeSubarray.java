package slidingwindow;

public class MaxSumofKSizeSubarray {
    public static void main(String[] args) {
        int[] numbers = {3,2,1,5,4};
        int k = 4;
        System.out.println("Max Sum is: "+maxSumOfArraySizeK(numbers, k));
    }
    private static int maxSumOfArraySizeK(int[] numbers, int k) {
        int n = numbers.length;
        int sumof4 = 0;
        //int sumAddedSubtd = 0;
        for (int i = 0; i < k; i++) {
            sumof4 += numbers[i];
        }
        int maxSum = sumof4;
        System.out.println("Sum of first K: "+sumof4);
        for (int i = k; i < n; i++) {
            sumof4 += numbers[i] - numbers[i-k];
            System.out.println("New Sum of k: "+sumof4);
            maxSum = Math.max(maxSum, sumof4);
            System.out.println("max: "+maxSum);
        }
        return maxSum;
    }
}
