package dsa.hashTable;

public class Node {
    int key;
    String name;
    Node next;

    Node() {
        next = null;
    }

    Node(int key, String name) {
        this.key = key;
        this.name = name;
        next = null;
    }
}
