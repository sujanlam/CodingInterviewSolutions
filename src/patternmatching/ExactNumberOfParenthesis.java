package patternmatching;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class ExactNumberOfParenthesis {
    public static void main(String[] args) {
        String word = "[({{[()]}})]";
        String word1 = "[({{[(])}})]";
        System.out.println(issEqual(word1));
    }

    private static boolean issEqual(String word) {
        char[] charArray = word.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : charArray) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (c == '}' && stack.peek() == '{' ||
                        c == ']' && stack.peek() == '[' ||
                        c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}
