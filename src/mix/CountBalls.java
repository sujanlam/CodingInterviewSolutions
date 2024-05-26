package mix;

public class CountBalls {
    public static void main(String[] args) {
        System.out.println(countBalls(5,15));
    }
    public static int countBalls(int lowLimit, int highLimit) {
        int[] count=new int[46];
        int maxCount = 0;
        int sum = 0;
        for (int i = lowLimit; i <= highLimit+1; i++) {
            while (i != 0){
                sum += ( i % 10);
                i /= 10;
            }
            maxCount = Math.max(maxCount, ++count[sum]);
        }

        return maxCount;
    }
}
