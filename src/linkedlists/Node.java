package linkedlists;

public class Node {
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
    public void printList() {
        Node current = this;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node reverseLinkedList(Node head){
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // Link the nodes together to form a list: 1 -> 2 -> 3 -> null
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        //node5.next = null;

        // Print the list starting from the first node
        node1.printList(); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null
        //Node reversedHead = reverseLinkedList(node1);
        //reversedHead.printList();
        deleteMiddleNode(node1);
        node1.printList();
    }

    public static void deleteMiddleNode(Node head){
        if(head == null || head.next == null){
            return;
        }
        Node fast = head;
        Node slow = head;
        Node prev = null;

        while (fast != null && fast.next != null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        if(prev != null){
            prev.next = slow.next;
        }
    }

}
