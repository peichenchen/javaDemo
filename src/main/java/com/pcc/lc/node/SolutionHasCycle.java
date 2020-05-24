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

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode0 = new ListNode(0);
        ListNode listNode4 = new ListNode(4);
        listNode3.next = listNode2;
        listNode2.next = listNode0;
        listNode0.next = listNode4;
        listNode4.next = listNode2;


        System.out.println(new SolutionHasCycle().hasCycle(listNode3));

    }
}


//
// if (head == null || head.next == null) {
//         return false;
//         }
//
//         ListNode slow = head;
//         ListNode fast = head;
//
//         while (fast != null && fast.next != null) {
//         slow = slow.next;
//         fast = fast.next.next;
//
//         if (slow == fast) {
//         return true;
//         }
//         }
//
//
//         return false;