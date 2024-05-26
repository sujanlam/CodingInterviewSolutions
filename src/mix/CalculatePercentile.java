package mix;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CalculatePercentile {
    public static void main(String[] args) {
        List<Integer> list100 = IntStream.rangeClosed(1, 200)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(list100);
        System.out.println(getPercentile(list100, 0));
        System.out.println(getPercentile(list100, 10));
        System.out.println(getPercentile(list100, 25));
        System.out.println(getPercentile(list100, 50));
        System.out.println(getPercentile(list100, 75.3));
        System.out.println(getPercentile(list100, 100));

    }

    static <T extends Comparable<T>> T getPercentile(Collection<T> input, double percentile) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("The input dataset cannot be null or empty.");
        }
        if (percentile < 0 || percentile > 100) {
            throw new IllegalArgumentException("Percentile must be between 0 and 100 inclusive.");
        }
        List<T> sortedList = input.stream()
                .sorted()
                .collect(Collectors.toList());

        int rank = percentile == 0 ? 1 : (int) Math.ceil(percentile / 100.0 * input.size());
        return sortedList.get(rank - 1);
    }
}
