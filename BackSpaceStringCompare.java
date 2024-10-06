package strings;

import java.util.Stack;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        String s1 = "axx#bb#c";
        String s2 = "axbd#c#c";
        System.out.println(areStringsEqualWithBackSpaces(s1, s2));
    }

    private static int areStringsEqualWithBackSpaces1(String s1, String s2) {

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        for (int i = 0; i < sb1.length() - 1; i++) {
            char c1 = sb1.charAt(i);
        }

        return 1;
    }

    private static int areStringsEqualWithBackSpaces(String s1, String s2) {

        Stack<Character> stack1 = new Stack<Character>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!stack1.isEmpty() && c == '#') {
                stack1.pop();
            }
            if (c != '#') stack1.push(c);
        }
        System.out.println(stack1);
        Stack<Character> stack2 = new Stack<Character>();
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!stack2.isEmpty() && c == '#') {
                stack2.pop();
            }
            if (c != '#') stack2.push(c);
        }
        System.out.println(stack2);
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.pop() != stack2.pop()) return 0;
        }

        return 1;
    }
}
