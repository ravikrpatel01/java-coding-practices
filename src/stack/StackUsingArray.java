package stack;

import java.util.Scanner;

public class StackUsingArray {
    static int top = -1;

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull(int[] arr) {
        return top == arr.length - 1;
    }

    public static void push(int[] stack, int val) {
        if (isFull(stack)) {
            System.out.println("Stack is Overflow!");
        }else{
            stack[++top] = val;
        }
    }

    public static void pop(int[] stack) {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        }else{
            int val = stack[top--];
            System.out.println("Deleted value: " + val);
        }
    }

    public static void peek(int[] stack) {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
        }else {
            System.out.println("Peek Element: " + stack[top]);
        }
    }

    public static void display(int[] stack) {
        if (isEmpty()) System.out.println("Stack is empty.");
        System.out.print("\nStack Elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int ch;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter you choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter a value: ");
                    int val = sc.nextInt();
                    push(arr, val);
                    break;
                case 2:
                    pop(arr);
                    break;
                case 3:
                    peek(arr);
                    break;
                case 4:
                    display(arr);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please Enter a valid choice!");
            }
        }while (ch != 5);
    }
}
