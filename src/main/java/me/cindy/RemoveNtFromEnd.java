package me.cindy;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNtFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;

        if (n == 1) {
            ListNode removeLastNode = head;
            while (head.next.next != null){
                head = head.next;
            }
            head.next = null;
            return removeLastNode;
        }

        // reverse head
        ListNode reverse = reverse(head);

        // delete the Nth Node
        ListNode dummy = reverse;

        int count = 2;
        while (reverse.next != null && n != count) {
            reverse = reverse.next;
            count++;
        }
        if (reverse.next != null) {
            reverse.next = reverse.next.next;
        }

        // reverse back
        return reverse(dummy);
    }

    public ListNode reverse(ListNode listNode) {
        ListNode pre = null;
        ListNode curr = listNode;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

}
