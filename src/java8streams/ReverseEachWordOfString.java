package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        reverseWord("This is from the last line");
    }

    private static void reverseWord(String s) {
        String[] words = s.split(" ");
        List<String> reversed = Arrays.stream(words).map((word) -> new StringBuilder(word).reverse().toString()).collect(Collectors.toList());
        System.out.println(reversed);
    }
}
