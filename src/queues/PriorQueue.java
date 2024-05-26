package queues;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        pqueue.add(10);
        pqueue.add(20);
        pqueue.add(15);
        //System.out.println(pqueue);
        //System.out.println(pqueue.peek());
        //System.out.println(pqueue.poll());
        //System.out.println(pqueue);
        //System.out.println(pqueue.peek());
        PriorityQueue<String> pq = new PriorityQueue<>((s1, s2) -> s1.compareTo(s2));

        //Add elements to the priority queue
        pq.offer("grape");
        pq.offer("apple");
        pq.offer("banana");
        pq.offer("orange");
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        /*List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("orange");
        list.add("apple");
        list.add("grape");
        PriorityQueue<String> pqw = new PriorityQueue<>((list));
        System.out.println(pqw);
        System.out.println("Sorted list:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }*/
    }
}
