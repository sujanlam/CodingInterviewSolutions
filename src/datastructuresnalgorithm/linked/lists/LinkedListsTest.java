package linked.lists;

public class LinkedListsTest {
    private Node head;

    public LinkedListsTest() {
        this.head = null;
    }
    public static void main(String[] args) {
        LinkedListsTest list = new LinkedListsTest();

        // Add elements to the list
        list.add(11);
        list.add(2);
        list.add(33);
        list.add(14);

        // Print the original list
        System.out.print("Original LinkedList: ");
        list.printList();

        // Reverse the list
        list.reverse();

        // Print the reversed list
        System.out.print("Reversed LinkedList: ");
        list.printList();
    }
    // Method to add a node to the end of the list
    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to reverse the linked list and return the previous node
    public Node reverseList(Node head) {
        Node cur = head;
        Node prev = null;
        while (cur != null){
            Node next = cur.next;
           cur.next = prev;
           prev = cur;
            cur = next;
        }
        return prev;
    }

    // Method to reverse the linked list of the current instance and update head
    public void reverse() {
        head = reverseList(head);
    }
}

