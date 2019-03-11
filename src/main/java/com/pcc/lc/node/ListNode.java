package com.pcc.lc.node;

/**
 * @author peichenchen
 * @date 2019/03/02
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        int nextVal = next != null ? next.val : -1;

        return "ListNode{" +
                "val=" + val +
                ", next=" + nextVal +
                '}';
    }

}