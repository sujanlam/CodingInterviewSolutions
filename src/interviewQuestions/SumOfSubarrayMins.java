package interviewQuestions;

public class SumOfSubarrayMins {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }

    private static int sumSubarrayMins(int[] arr) {

        int totalSumOfMins = 0;
        int sumof2 = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSumOfMins += arr[i];
        }
        for (int i = 0, k=0; i < arr.length-1; i++) {
          int min = Math.min(arr[i], arr[i+1]);
          sumof2 += min;
        }
        System.out.println("Sum of 2 "+sumof2);

        return totalSumOfMins;
    }
}
