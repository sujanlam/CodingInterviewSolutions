package stacks;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String s = "211+(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }

    private static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            //Number
            if (curChar >= '0' && curChar <= '9') {
                int num = 0;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                sum += num * sign;
                i--;
            } else if (curChar == '+') {
                sign = 1;

            }else if (curChar == '-') {
                sign = -1;

            }else if (curChar == '(') {
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = 1;

            }else if (curChar == ')') {
                sum = stack.pop()*sum;
                sum += stack.pop();
            }
        }
        return sum;
    }
}
