package mix;

public class ContainingMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int maxCollection = Integer.MIN_VALUE;

        int start = 0;
        int end = height.length - 1;

        while (start < end){
            int newArea = Math.min(height[start], height[end])* (end - start);
            maxCollection = Math.max(maxCollection, newArea);

            if(height[start] <= height[end]){
                start++;
            }else {
                end--;
            }
        }

        return maxCollection;
    }
}
