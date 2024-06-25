package linked.lists;

import java.util.LinkedList;

public class LinkedLists {
    public Node reverseList(Node head){

        Node current = head;
        Node previous = null;
        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        System.out.println(linkedList);
        linkedList.pop();
        System.out.println(linkedList);

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.offer("A");
        linkedList1.offer("B");
        linkedList1.offer("C");
        linkedList1.offer("D");
        linkedList1.offer("F");
        System.out.println(linkedList1);
        //linkedList1.poll();
        linkedList1.add("Z");
        linkedList1.add(1, "X");
        linkedList1.remove("F");
        System.out.println(linkedList1);
        System.out.println(linkedList1.peekFirst());
        System.out.println(linkedList1.peekLast());
        linkedList1.addFirst("0");
        linkedList1.add("ZZ");
        System.out.println(linkedList1);

    }
}
