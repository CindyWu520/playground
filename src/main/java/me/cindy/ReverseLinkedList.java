package me.cindy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */

public class ReverseLinkedList {
    public ListNode reverseList (ListNode head) {
        if (head == null) return null;

        Stack<Integer> stack = new Stack<>();

        while (head.next != null) {
            stack.push(head.val);
            head = head.next;
        }
        // last value of head
        stack.push(head.val);

        ListNode reverse = new ListNode(0);
        ListNode curr = reverse;

        while (!stack.empty()) {
            curr.next = new ListNode(stack.pop());
            curr = curr.next;
        }

        return reverse.next;
    }
}
