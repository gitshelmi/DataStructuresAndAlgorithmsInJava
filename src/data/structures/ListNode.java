package data.structures;

/*
 * Based on the interface provided on https://leetcode.com/problems/add-two-numbers/
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ListNode {
    public int value;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    // for easy initialization and unit-testing
    public ListNode(int[] values) {
        if (values.length == 0)
            return;

        value = values[0];
        var currentNode = this;
        for (var i = 1; i < values.length; i++) {

            var newNode = new ListNode(values[i]);
            currentNode.next = newNode;
            currentNode = currentNode.next;
        }
    }

    public void print() {
        var nodeIterator = this;
        while (nodeIterator != null) {
            System.out.print(nodeIterator.value + "->");
            nodeIterator = nodeIterator.next;
        }
        System.out.println("*");
    }
}
