package com.pcc.node;

/**
 * @author peichenchen
 * @date 2019/03/02
 */
public class Reverse {

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        //反转单链表
        ListNode node = reverseList2(a1);

        //打印输出结果
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            System.out.print(node != null ? "->" : "");
        }
    }

    /**
     * 头插法建立新链表，达到反转目的
     */
    public static ListNode reverseList2(ListNode head) {

        ListNode newHead = null;
        ListNode previous = null;

        while (head != null) {
            newHead = new ListNode(head.val);
            newHead.next = previous;
            previous = newHead;

            head = head.next;
        }

        return newHead;
    }
}
