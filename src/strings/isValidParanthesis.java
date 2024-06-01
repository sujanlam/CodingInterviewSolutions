package strings;

import java.util.Stack;

public class isValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] strArr = s.toCharArray();
        for (char c: strArr) {
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if ((c == ')') && ((stack.peek() == '(')) ||
                        (c == ']') && ((stack.peek() == '[')) ||
                        (c == '}') && ((stack.peek() == '{'))) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

        }
        return stack.isEmpty() ? true : false;
    }
}
