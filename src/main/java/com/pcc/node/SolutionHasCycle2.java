package com.pcc.node;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author peichenchen
 * @date 2019/03/03
 */
public class SolutionHasCycle2 {

    public ListNode detectCycle(ListNode head) {

        Set<ListNode> nodeSet = new HashSet();

        if (head == null || head.next == null) {
            return null;
        }

        while (head != null) {
            if (nodeSet.contains(head)) {
                return head;
            } else {
                nodeSet.add(head);
                head = head.next;
            }
        }

        return null;
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


        System.out.println(new SolutionHasCycle2().detectCycle(listNode3));

    }
}
