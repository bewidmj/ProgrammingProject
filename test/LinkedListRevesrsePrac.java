package test;

public class LinkedListRevesrsePrac {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4
        Node node4 = new Node(null, 4);
        Node node3 = new Node(node4, 3);
        Node node2 = new Node(node3, 2);
        Node node1 = new Node(node2, 1);

        System.out.println("Original list: " + node1);
        Node reversedHead = reverse(node1);
        System.out.println("Reversed list: " + reversedHead);
    }

    public static Node reverse(Node head) {
6
        Node prev = null;
        Node curr = head;

        while (curr.next != null) {

            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }
}
class Node {
    int data;
    Node next;

    public Node(Node next, int data) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
