package com.pcc.lc.node;

/**
 * @author peichenchen
 * @date 2020/05/24
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {

        ListNode curr = head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while (curr != null && curr.next != null) {

            // nodes to be swapped
            ListNode left = curr;
            ListNode right = curr.next;


            // swap
            left.next = right.next;
            right.next = left;
            prev.next = right;

            // Reinitializing curr and prev
            prev = curr;
            curr = curr.next;
        }

        return dummy.next;
    }
}
