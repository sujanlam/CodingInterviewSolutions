package arrays;

public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{9,79,18,50,3,61,49}));
    }
    public static int maxProfit(int[] prices) {

        if (prices.length < 1) {
            return 0;
        }

        int profit = 0;
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < temp) {
                temp = prices[i]; //7
            }
            else{
                profit = Math.max(profit, prices[i] - temp);
            }
        }
        return profit;
    }
}
