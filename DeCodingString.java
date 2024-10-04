package strings;

import java.util.Stack;

public class DeCodingString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> charStack = new Stack<Character>();
        Stack<Integer> countStack = new Stack<>();
        int count = 0;
        int curNum = 0;
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                curNum = curNum * 10 + (c - '0');
            } else if (c =='[') {
                countStack.push(curNum);
                charStack.push(c);
                curNum = 0;
            }else if(c == ']') {
                
            }
        }
        return sb.toString();
    }
}
