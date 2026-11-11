package interview2;

public class LinkedListProgram {

    public static void main(String[] args) {
        ListNode node0 = new ListNode(1, node1);
        ListNode node1 = new ListNode(2, node0);
        ListNode node2 = new ListNode(3, node1);
        ListNode node3 = new ListNode(4, node2);
        ListNode node4 = new ListNode(5, node3);
        
    }
    
}

class ListNode {
    int data;
    ListNode next;

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
