package com.pcc.node;

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

//     if (head == null) return null;
//
//    ListNode previous = null;   //记录上个节点
//    ListNode newHead = null;    //头插法的新头节点
//
//        while (head != null) {
//        newHead = new ListNode(head.val);   //新建头结点
//        newHead.next = previous;
//
//        previous = newHead;
//        head = head.next;   //下一个节点
//    }
//        return newHead;
}