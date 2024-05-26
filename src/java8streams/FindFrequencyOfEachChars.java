package java8streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Using Java 8 Streams to find min and max
public class FindFrequencyOfEachChars {
    public static void main(String[] args) {
        String input = "elephant";
        long start = System.nanoTime();
        coutAllChars(input);
        long end = System.currentTimeMillis();
        long totalTime = end - start;
        System.out.println(totalTime);
    }

    private static void coutAllChars(String input) {
        IntStream stream = input.chars();
        //Converts ASCII value back to char
        Stream charStream = stream.mapToObj(c -> (char) c);

        Map<Character, Long> mapp = (Map<Character, Long>) charStream.collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));
        mapp.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

}
