package slidingwindow;

public class TrappedWater {

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,4};
        System.out.println("Trapped water: " + trap(height));
    }
    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int trappedWater = 0;
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;

        while (left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }else {
                    trappedWater += leftMax-height[left];
                }
                left++;
            }else {
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else {
                    trappedWater += rightMax-height[right];
                }right--;
            }
        }

        return trappedWater;
    }
}
