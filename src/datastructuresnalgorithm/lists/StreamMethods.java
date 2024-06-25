package lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 9, 3, 7, 2, 8, 4, 6, 0);
        //Squares of even numbers from a list
        List<Integer> evenSquares = numbers.stream().filter(n-> n%2==0).map(n -> n*n).collect(Collectors.toList());
        System.out.println(evenSquares);
        //Find first even number
        int firstEven = numbers.stream().filter(n->n%2==0).findFirst().orElse(-1);
        System.out.println(firstEven);

    }
}
