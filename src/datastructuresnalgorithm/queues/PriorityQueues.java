package queues;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue<String> pQueue = new PriorityQueue<>();
        System.out.println(pQueue.isEmpty());
        pQueue.add("Sam");
        pQueue.add("John");
        pQueue.add("Smith");
        pQueue.add("Jose");
        System.out.println(pQueue.isEmpty());
        System.out.println(pQueue);

        Queue<Integer> pQueueInt = new java.util.PriorityQueue<>();
        System.out.println(pQueueInt.isEmpty());
        pQueueInt.offer(12);
        pQueueInt.offer(8);
        pQueueInt.offer(27);
        pQueueInt.offer(2);
        System.out.println(pQueue.isEmpty());
        System.out.println(pQueueInt);

        Queue<Double> q1= new PriorityQueue<>(Comparator.reverseOrder());
        q1.add(3.0);
        q1.add(2.5);
        q1.add(4.0);
        q1.add(1.5);
        q1.add(2.0);
        while (!q1.isEmpty()){
            System.out.print(q1.poll()+" ");
        }
        System.out.println("");
        Queue<String> q2= new PriorityQueue<>();
        q2.add("B");
        q2.add("C");
        q2.add("A");
        q2.add("D");
        q2.add("F");
        while (!q2.isEmpty()){
            System.out.print(q2.poll()+" ");
        }
    }
}
