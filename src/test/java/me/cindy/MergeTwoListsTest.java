package me.cindy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeTwoListsTest {
    @Test
    public void test01(){
        ListNode list1 = toListNode(1, 2, 4);
        ListNode list2 = toListNode(1, 3, 4);

        ListNode actual = new MergeTwoLists().mergeTwoLists(list1, list2);

        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, toArray(actual));
    }

    @Test
    public void test02(){
        ListNode list1 = null;
        ListNode list2 = null;

        ListNode actual = new MergeTwoLists().mergeTwoLists(list1, list2);

        assertNull(actual);
    }

    @Test
    public void test03(){
        ListNode list1 = null;
        ListNode list2 = toListNode(0);

        ListNode actual = new MergeTwoLists().mergeTwoLists(list1, list2);

        assertArrayEquals(new int[]{0}, toArray(actual));
    }

    // int[] to ListNode
    public ListNode toListNode(int... input) { // unfix params
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : input) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // ListNode to int[]
    public int[] toArray(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (listNode != null) {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }

        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
