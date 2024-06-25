package utils;

import java.util.List;
import java.util.Stack;

public class Display<T> {

    public static <T> void displayList(List<T> collection){
        for (T coll: collection) {
            System.out.print(coll+" ");
        }
    }
    public static <T> void displayArr(int[] array){
        for (int elem: array){
            System.out.print(elem+" ");
        }
    }
    public static <T> void displayStack(Stack<T> stack){
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
