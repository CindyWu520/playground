package me.cindy;

public class ReverseLinkedListOptimize {
    public ListNode reverseList (ListNode head) {
        ListNode curr = head;
        ListNode pre = null;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }
}
