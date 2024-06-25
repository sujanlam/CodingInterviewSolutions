package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class AsteriodsCollision {
    public static void main(String[] args) {
        int[] asteroids = {8,-8};
        int[] leftOver = findLeftOver(asteroids);
        for (int i = 0; i < leftOver.length; i++) {
            System.out.println(leftOver[i]);
        }
    }
    private static int[] findLeftOver(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[10];
        //int i = 0;
        for (int i = 0; i < (asteroids.length); i++) {
            int ast = asteroids[i];
            if(stack.isEmpty()){
                stack.push(ast);
            }else {
                if((ast > 0 && stack.peek() < 0) || (ast < 0 && stack.peek() > 0 )){
                    if(Math.abs(ast) > Math.abs(stack.peek()) || Math.abs(ast) == Math.abs(stack.peek())){
                        stack.pop();
                    }
                }else {
                    stack.push(asteroids[i]);
                }
            }
        }
        while (!stack.isEmpty()){
            //int
        }
        return res;
    }
}
