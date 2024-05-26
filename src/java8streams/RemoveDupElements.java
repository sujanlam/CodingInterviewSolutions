package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupElements {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9,1,2,3,1,2,3,4,6,4,5,6);
        removeDups(nums);
    }

    private static void removeDups(List<Integer> nums) {
        List<Integer> res = nums.stream().distinct().collect(Collectors.toList());
        res.forEach(System.out::println);
    }
}
