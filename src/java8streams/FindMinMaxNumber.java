package java8streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Using Java 8 Streams to find min and max
public class FindMinMaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,12,5,7,19,0,1,211);

        int max = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum number: " +max);

        int min = numbers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum number: "+min);
    }

}
