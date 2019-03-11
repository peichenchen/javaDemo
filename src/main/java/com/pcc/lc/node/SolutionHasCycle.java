package com.pcc.lc.node;

/**
 * @author peichenchen
 * @date 2019/03/03
 */
public class SolutionHasCycle {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }


        return false;
    }
}
