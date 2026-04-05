import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class Stack {
    Node top;

    void push(int val) {
        Node n = new Node(val);
        n.next = top;
        top = n;

    }

    int pop() {
        int v = top.data;
        top = top.next;
        return v;

    }

    int peek() {
        return top.data;

   }

    boolean isEmpty() {
        return top == null;

    }
}

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack mainStack = new Stack();
        Stack minStack = new Stack();

        for (int i = 0; i < n; i++) {

            String op = sc.next();

            if (op.equals("ADD")) {

                int v = sc.nextInt();
                mainStack.push(v);

                if (minStack.isEmpty() || v <= minStack.peek()) {
                    minStack.push(v);
                } else {
                    minStack.push(minStack.peek());
                }

            } else if (op.equals("DEL")) {

                if (mainStack.isEmpty()) {
                    System.out.println("Empty");
                } else {
                    mainStack.pop();
                    minStack.pop();
                }

            } else if (op.equals("MIN")) {

                if (mainStack.isEmpty()) {
                    System.out.println("Empty");
                } else {
                    System.out.println(minStack.peek());
                }

            }
        }
    }

}
