package dsa.queue;

public class Queue1 {
    Node front;
    Node back;
    int cnt;
    int size;

    Queue1(int size) {
        this.size = size;
        cnt = 0;
        front = null;
        back = null;
    }

    void enQueue(int data) {
        Node node = new Node(data);

        if (back == null) {
            front = node;
            back = node;
            System.out.println(node.data + " addedd....");
        } else {
            back.next = node;
            back = back.next;
            System.out.println(node.data + " addedd....");
        }
    }

    void deQueue() {
        System.out.println(front.data + " dequeuedd...");
        front = front.next;

    }

    void print() {
        Node temp = front;
        System.out.println("\n");
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.println("\n");
    }



}




