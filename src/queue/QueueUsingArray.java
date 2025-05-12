package queue;

import java.util.Scanner;

public class QueueUsingArray {
    public static int front = -1;
    public static int rear = -1;

    public static boolean isFull(int[] queue) {
        return rear >= queue.length - 1;
    }

    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static int size() {
        if (isEmpty()) return 0;
        return rear - front + 1;
    }
    public static void enqueue(int[] queue, int val) {
        if (isFull(queue)) {
            System.out.println("Queue is full.");
        } else {
            if (front == -1) front++;
            queue[++rear] = val;
        }
    }
    public static void dequeue(int[] queue) {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            int val = queue[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
            System.out.println("Deleted value: " + val);
        }
    }
    public static void peek(int[] queue) {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Peek element: " + queue[front]);
        }
    }
    public static void display(int[] queue) {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue Elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] queue = new int[5];
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to Add in queue");
            System.out.println("Enter 2 to Delete from queue");
            System.out.println("Enter 3 to See peek element in queue");
            System.out.println("Enter 4 to Display queue elements");
            System.out.println("Enter 5 to Print size of queue");
            System.out.println("Enter 6 to EXIT");
            System.out.print("Enter you choice: ");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter element you want to add: ");
                int val = sc.nextInt();
                enqueue(queue, val);
            } else if (ch == 2) {
                dequeue(queue);
            } else if (ch == 3) {
                peek(queue);
            } else if (ch == 4) {
                display(queue);
            } else if (ch == 5) {
                System.out.println("Size: " + size());
            } else if (ch == 6) {
                break;
            } else {
                System.out.println("Please enter a valid choice!");
            }
        }
    }
}
