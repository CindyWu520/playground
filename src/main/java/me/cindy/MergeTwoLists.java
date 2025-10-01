package me.cindy;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(); // initial with "0 >"
        ListNode mergedLists = temp;
        ListNode next;

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    next = list1;
                    list1 = list1.next;
                } else {
                    next = list2;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                next = list1;
                list1 = list1.next;
            } else {
                next = list2;
                list2 = list2.next;
            }
            temp.next = next;
            temp = temp.next;
        }
        return mergedLists.next;
    }
}
