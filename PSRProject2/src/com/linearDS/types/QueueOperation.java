package com.linearDS.types;

class Queue {
    private static int front, rear, capacity;
    private static int queue[];

    Queue(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }

    static void enqueue(int item) {
        if (rear == capacity) {
            System.out.println("\nQueue is full");
            return;
        } else {
            queue[rear] = item;
            rear++;
        }
    }

    static void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity) {
                queue[rear] = 0;
            }
            rear--;
        }
    }

    static void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.printf(" %d ", queue[i]);
        }
    }

    static void front() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.printf("\nFront Element of the queue: %d", queue[front]);
    }
}

public class QueueOperation {
    public static void main(String[] args) {
        Queue q = new Queue(4);

        System.out.println("Initial Queue:");
        q.display();

        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(7);

        System.out.println("\nQueue after Enqueue Operation:");
        q.display();

        q.front();

        q.enqueue(90);

        q.display();

        q.dequeue();
        q.dequeue();
        System.out.printf("\nQueue after two Dequeue operations:");
        q.display();

        q.front();
    }
}
