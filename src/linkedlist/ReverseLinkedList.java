package linkedlist;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    private static ListNode head;
    public ReverseLinkedList() {
        head = null;
    }

    public void addLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void reverseList() {
        ListNode currNode = head;
        ListNode prevNode = null;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList l1 = new ReverseLinkedList();
        l1.addLast(12);
        l1.addLast(13);
        l1.addLast(14);
        l1.addLast(15);
        l1.addLast(16);
        System.out.println("Original Linked List: ");
        l1.printList();
        reverseList();
        System.out.println("Reversed Linked List:");
        l1.printList();
    }
}
