package me.cindy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseLinkedListTest {
    @Test
    public void test01(){
        ListNode input = toListNode(1, 2, 3, 4, 5); // head = 1

        ListNode actual = new ReverseLinkedList().reverseList(input);

        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, toArray(actual));

    }

    @Test
    public void test02(){
        ListNode input = null;// head = 1

        ListNode actual = new ReverseLinkedList().reverseList(input);

        assertNull(actual);
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
