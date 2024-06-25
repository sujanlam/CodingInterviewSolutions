package searchalgo;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 15, 5, 25);
        int target = 25;
        System.out.println(findNum(numbers, 25));
    }

    //Finding 25: iterate all the way to the end of the array and check to see
    // if the element matches the target BIG O = 0(N)
    public static int findNum(List<Integer> numbers, int target) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
