package queues;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        System.out.println(queue.isEmpty());
        queue.add("Sam");
        queue.add("John");
        queue.add("Smith");
        queue.add("Jose");
        System.out.println(queue.isEmpty());
        System.out.println(queue);

        Queue<String> queue1 = new LinkedList<>();
        System.out.println(queue1.isEmpty());
        queue1.offer("Sam");
        queue1.offer("John");
        queue1.offer("Smith");
        queue1.offer("Jose");
        System.out.println(queue1.isEmpty());
        System.out.println(queue1);
        List<String> q1 = queue1.stream().filter(a-> a.startsWith("S")).collect(Collectors.toList());
        System.out.println(q1);
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
        System.out.println(queue1);

    }
}
