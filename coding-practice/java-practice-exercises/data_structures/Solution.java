package data_structures;

import java.awt.*;
import java.util.ArrayList;

/*
 * Definition for singly-linked list. */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int l1Number = 0;
        int l2Number = 0;

        while(l1 != null) {
            l1Number = l1Number * 10 + l1.val;
            l1 = l1.next;
        }
        while(l2 != null) {
            l2Number =  l2Number * 10 + l2.val;
            l2 = l2.next;
        }

//         int reverseL1 = 0;
//         while(l1Number > 1) {
//             int temp = 0;
//             temp = l1Number % 10;
//             l1Number = l1Number / 10;
//             reverseL1 = reverseL1 * 10 + temp;
//         }

//         int reverseL2 = 0;
//         while(l2Number > 1) {
//             int temp = 0;
//             temp = l2Number % 10;
//             l2Number = l2Number / 10;
//             reverseL2 = reverseL2 * 10 + temp;
//         }

//         int result = reverseL1 + reverseL2;

        int result = l1Number + l2Number;

        ListNode rootNode = new ListNode();
        ListNode tempNode = rootNode;
        while(result > 1) {
            int temp = 0;
            temp = result % 10;
            result = result / 10;
            if (rootNode.val == 0) {
                rootNode.val = temp;
            } else {
                ListNode node = new ListNode(temp);
                rootNode.next = node;
            }
        }
        return rootNode;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);


        ListNode result = addTwoNumbers(l1, l2);
        System.out.println(result);

    }
}
