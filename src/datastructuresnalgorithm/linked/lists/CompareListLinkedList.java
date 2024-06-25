package linked.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareListLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> llInt = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            llInt.add(i);
        }
        long startTime = System.nanoTime();
        llInt.remove(500000);
        long endTime = System.nanoTime();
        System.out.println("Time taken for linkedlist: "+(endTime-startTime));

        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            llInt.add(i);
        }
        long startTime1 = System.nanoTime();
        llInt.remove(500000);
        long endTime1 = System.nanoTime();
        System.out.println("Time taken for list:       "+(endTime1-startTime1));

    }
}
