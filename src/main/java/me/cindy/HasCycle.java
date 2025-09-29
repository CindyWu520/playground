package me.cindy;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodeHashSet = new HashSet<>();

        while (head != null) {
            if (!nodeHashSet.contains(head)){
                nodeHashSet.add(head);
                head = head.next;
            } else {
                return true;
            }
        }
        return false;
    }
}
