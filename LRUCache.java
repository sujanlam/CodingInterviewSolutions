package arrays;

import java.util.HashMap;

public class LRUCache<K,V>{

    private class Node{
        K key;
        V value;
        Node next;
        Node prev;

        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
    private final int capacity;
    private HashMap<K, Node> map;
    private Node head;
    private Node tail;
    
    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public void put(K key, V value){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            removeNode(node);
            addToFront(node);
        }
    }
    
    //Get value of the key if it exists
    public V get(int key){
        if(!map.containsKey(key)){
            return null;
        }
        Node node = map.get(key);
        removeNode(node);
        insertNode(node);
        return node.value;
    }

    private void insertNode(Node node) {

    }


    private void addToFront(Node node) {

    }

    private void removeNode(Node node) {
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;

        if(tail == null){
            tail = head;
        }
    }
}
