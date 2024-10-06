package strings;

import java.util.Stack;

public class DecodeStrings {
    public static void main(String[] args) {
        String str1 = "3[a]2[bc]";
        String str2 = "3[a2[c]]";
        String str3 = "2[abc]3[cd]ef";
        System.out.println("Result: ");
        System.out.println(decodeGivenString(str1));
        System.out.println(decodeGivenString(str2));
        System.out.println(decodeGivenString(str3));
    }


    private static String decodeGivenString(String str) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> charStack = new Stack<>();
        int index = 0;

        while (index < str.length()) {
            char c = str.charAt(index);
            if (Character.isDigit(c)) {
                int count = 0;
                while (Character.isDigit(c) && index < str.length()) {
                    count = 10 * count + (c - '0');
                    index ++;
                    if(index < str.length()) {
                        c = str.charAt(index);
                    }
                }
                countStack.push(count);
            } else if (c == '[') {
                charStack.push(result);
                result = new StringBuilder();
                index++;
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(charStack.pop());
                int count = countStack.pop();
                for (int i = 0; i < count; i++) {
                    temp.append(result);
                }
                result = temp;
                index++;
            } else {
                result.append(c);
                index++;
            }
        }
        return result.toString();
    }
}
