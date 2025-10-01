package me.cindy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveNtFromEndTest {
    @Test
    public void test01(){
        ListNode list = toListNode(1, 2, 3, 4, 5);

        ListNode actual = new RemoveNtFromEnd().removeNthFromEnd(list, 4);

        assertArrayEquals(new int[]{1, 3, 4, 5}, toArray(actual));
    }

    @Test
    public void test02(){
        ListNode list = toListNode(1, 2, 3, 4, 5);

        ListNode actual = new RemoveNtFromEnd().removeNthFromEnd(list, 1);

        assertArrayEquals(new int[]{1, 2, 3, 4}, toArray(actual));
    }

    @Test
    public void test03(){
        ListNode list = toListNode(1);

        ListNode actual = new RemoveNtFromEnd().removeNthFromEnd(list, 1);

        assertNull(actual);
    }

    @Test
    public void test04(){
        ListNode list = toListNode(1, 2);

        ListNode actual = new RemoveNtFromEnd().removeNthFromEnd(list, 1);

        assertArrayEquals(new int[]{1}, toArray(actual));
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
