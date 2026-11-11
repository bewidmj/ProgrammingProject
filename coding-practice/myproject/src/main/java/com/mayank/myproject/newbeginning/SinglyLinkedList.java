package com.mayank.myproject.newbeginning;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    void insertAtStart(Node node) {
        node.next = this.head;
        this.head = node;
    }

    void insertAtEnd(Node node) {
        Node currentNode = this.head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    void removeFromStart() {
        this.head = this.head.next;
    }

    void removeFromEnd() {
        Node prev = null;
        Node currentNode = this.head;
        while (currentNode.next != null) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        prev.next = null;
    }

    void removeAtPos(int pos) {
        int count = 0;
        Node prev = null;
        Node currentNode = this.head;
        while (currentNode != null && count < pos) {
            prev = currentNode;
            currentNode = currentNode.next;
            count++;
        }
        if (currentNode != null) {
            prev.next = currentNode.next;
        } else {
            System.out.println("position is out of range");
        }
    }

    int printAndCount() {
        int count = 0;
        Node currentNode = this.head;
        while(currentNode != null) {
            count++;
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        return count;
    }


    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList(new Node(10));

        Node node1 = new Node(8);
        Node node2 = new Node(5);
        Node node3 = new Node(1);

        sl.insertAtEnd(node1);
        sl.insertAtEnd(node2);
        sl.insertAtEnd(node3);

        sl.insertAtStart(new Node(15));
        sl.insertAtEnd(new Node(20));

        System.out.println("length of linked list: "+sl.printAndCount());
        sl.removeAtPos(7);
//        sl.removeFromStart();
//        sl.removeFromEnd();
        System.out.println("length of linked list: "+sl.printAndCount());
    }

}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}