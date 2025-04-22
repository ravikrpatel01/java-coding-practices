class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
public class LinkedList {
    private int size;
    private Node head;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int val) {
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
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            addFirst(val);
            return;
        }

        if (index == size) {
            addLast(val);
            return;
        }

        Node newNode = new Node(val);
        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public int removeFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty.");
        }
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (head == null) {
            throw new RuntimeException("List is empty.");
        }
        if (head.next == null) {
            return removeFirst();
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        int val = current.next.val;
        current.next = null;
        size--;
        return val;
    }

    public int removeAtIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == size) {
            return removeLast();
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        int val = current.next.val;
        current.next = current.next.next;
        size--;
        return val;
    }

    public int get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        return current.val;
    }

    public boolean contains(int val) {
        Node current = head;
        while (current != null) {
            if (current.val == val) return true;
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.addAtIndex(0, 50);
        System.out.println("Linked List Elements: ");
        list.printList();
        System.out.println("Remove First: " + list.removeFirst());
        System.out.println("Remove Last: " + list.removeLast());
        System.out.println("Remove at Index(2): " + list.removeAtIndex(2));
        System.out.println("Linked List Elements: ");
        list.printList();
    }
}
