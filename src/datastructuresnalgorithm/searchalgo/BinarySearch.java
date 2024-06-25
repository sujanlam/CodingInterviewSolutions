package searchalgo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int target = 9;
        int[] numbers = new int[1000];

        System.out.println(findNum(numbers, target));
        System.out.println(Arrays.binarySearch(numbers, target));
    }

    public static int findNum(int[] numbers, int target) {
        //Collections.sort(numbers);
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Mid: " + mid);
            int midNum = numbers[mid];

            if (midNum == target) {
                return mid;
            }
            if (target < midNum) {
                right = mid - 1;
            } else if(target > midNum){
                left = mid + 1;
            }else {
                return midNum;
            }
        }
        return -1;
    }

}
