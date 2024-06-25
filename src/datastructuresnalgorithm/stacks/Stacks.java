package stacks;

import utils.Display;

import java.util.Stack;

public class Stacks<T> extends Display {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push(12);
        stack.push(7);
        stack.push(43);
        stack.push(99);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.lastElement());
        System.out.println(stack.firstElement());
        System.out.println(stack.search(79));
        System.out.println(stack.search(43));
        System.out.println(stack.indexOf(99));
    }

}
