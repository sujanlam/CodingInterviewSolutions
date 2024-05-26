package java8streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetAllEvenOddSum {
    public static void main(String[] args) {
        List<Integer> listofElements = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        getOddNums(listofElements);
        getEvenNums(listofElements);
        getSum(listofElements);
        getSum(12345);
    }

    private static void getOddNums(List<Integer> listofElements) {
        List<Integer> oddElements = listofElements.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());
        System.out.println(oddElements);
    }

    private static void getEvenNums(List<Integer> listofElements) {
        List<Integer> evenElements = listofElements.stream().filter(a -> a%2==0).collect(Collectors.toList());
        System.out.println(evenElements);
    }
    private static void getSum(List<Integer> listofElements) {
        Optional<Integer> sum = listofElements.stream().reduce((a, b) -> a+b);
        System.out.println(sum);
    }

    private static void getSum(int num) {
       IntStream stream = String.valueOf(num).chars();
       int sum = stream.map(Character::getNumericValue).sum();
        System.out.println(sum);
    }

}
