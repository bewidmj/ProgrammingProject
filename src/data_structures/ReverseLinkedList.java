package data_structures;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Print original list
        System.out.println("Original list:");
        printList(head);

        // Reverse the list
        Node reversedHead = reverse(head);

        // Print reversed list
        System.out.println("\nReversed list:");
        printList(reversedHead);
    }

    public static void printList(Node node) {
        Node current = node;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next;

            curr.next = prev;
            prev = curr;

            curr = next;

        }

        return prev;

    }
}
