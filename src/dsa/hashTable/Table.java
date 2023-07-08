package dsa.hashTable;

import dsa.hashTable.Node;

public class Table {
    Node[] arr;
    int size;

    Table(int size) {
        this.size = size;
        arr = new Node[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Node();
        }
    }

    void insert(int key,String name) {

        int index = key % size;

        Node node = new Node(key,name);

        Node temp = arr[index];

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        System.out.println(node.name + " Addedd....");

    }
}
