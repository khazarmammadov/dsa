package dsa.queue;

public class Queue {
    int[] arr;
    int size;
    int front;
    int back;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        back = -1;

    }

    public void enQueue(int data) {
        back++;
        arr[back] = data;

        System.out.println(arr[back] + " addedd...");
    }

    public void deQueue() {
        int person = arr[front];

        System.out.println(person + " dequeued....");

        for (int i = 0; i < back; i++) {
            arr[i] = arr[i + 1];
        }
        back--;

    }
}
