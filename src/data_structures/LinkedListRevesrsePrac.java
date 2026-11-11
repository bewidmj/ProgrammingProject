package data_structures;

public class LinkedListRevesrsePrac {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4
        ReversalNode node4 = new ReversalNode(null, 4);
        ReversalNode node3 = new ReversalNode(node4, 3);
        ReversalNode node2 = new ReversalNode(node3, 2);
        ReversalNode node1 = new ReversalNode(node2, 1);

        System.out.println("Original list: " + node1);
        ReversalNode reversedHead = reverse(node1);
        System.out.println("Reversed list: " + reversedHead);
    }

    public static ReversalNode reverse(ReversalNode head) {
6
        ReversalNode prev = null;
        ReversalNode curr = head;

        while (curr.next != null) {

            ReversalNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }
}
class ReversalNode {
    int data;
    ReversalNode next;

    public ReversalNode(ReversalNode next, int data) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ReversalNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
