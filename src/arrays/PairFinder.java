package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairFinder {
    public static List<List<Integer>> findPairs(int[] firstArray, int[] secondArray, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // Store elements of the second array in a set
        for (int num : secondArray) {
            set.add(num);
        }

        // Check each element of the first array
        for (int num : firstArray) {
            int complement = target - num;
            if (set.contains(complement)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(num);
                pair.add(complement);
                pairs.add(pair);
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] firstArray = {5,2,1,6,4};
        int[] secondArray = {3,5};
        int target = 10;

        List<List<Integer>> pairs = findPairs(firstArray, secondArray, target);

        if (pairs.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            System.out.println("Pairs found:");
            for (List<Integer> pair : pairs) {
                System.out.println(pair);
            }
        }
    }
}