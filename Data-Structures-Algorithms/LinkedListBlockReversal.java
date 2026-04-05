import java.util.Scanner;

class Node {
    Object data;
    Node next;

    Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

public class Q1 {

    public static Node append(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    public static Node createList(Scanner scanner, int n) {
        Node head = null;

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            head = append(head, value);
        }

        return head;

    }

    public static Node reverseBlock(Node start, Node stop) {
        Node previous = stop;
        Node current = start;

        while (current != stop) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        return previous;
    }

    public static Node restoreOriginalList(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;
        Node current = head;

        while (current != null) {
            int value = (Integer) current.data;

            if (value % 2 == 0) {
                Node blockStart = current;

                while (current != null && ((Integer) current.data) % 2 == 0) {
                    current = current.next;
                }

                Node nextBlock = current;
                Node reversedHead = reverseBlock(blockStart, nextBlock);

                prev.next = reversedHead;
                prev = blockStart;
            } else {
                prev = current;
                current = current.next;
            }
        }

        return dummy.next;

    }

    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print((Integer) current.data);

            if (current.next != null) {
                System.out.print(" ");
            }

            current = current.next;
        }

        System.out.println();

    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Node head = createList(scanner, n);

        head = restoreOriginalList(head);

        printList(head);

        scanner.close();
    }
}
