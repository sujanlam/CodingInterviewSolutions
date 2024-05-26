package java8streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortingAscDesc {
    public static void main(String[] args) {
        List<String> sortedStringElems = Arrays.asList("One", "Two", "Three", "Four", "Five");
        getResult(sortedStringElems);
        List<Integer> sortNumsElems = Arrays.asList(5, 1, 4, 9, 8, 2, 10);
        sortNums(sortNumsElems);
    }

    private static void getResult(List<String> listofElements) {
        List<String> reversedAsc = listofElements.stream().sorted().collect(Collectors.toList());
        System.out.println(reversedAsc);
        List<String> reversedDesc = listofElements.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversedDesc);
    }

    private static void sortNums(List<Integer> listofElements) {
        List<Integer> reversedAsc = listofElements.stream().sorted().collect(Collectors.toList());
        System.out.println(reversedAsc);
        List<Integer> reversedDesc = listofElements.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversedDesc);
        Optional<Integer> a = reversedDesc.stream().skip(2).findFirst();
        System.out.println(a);
    }

}
