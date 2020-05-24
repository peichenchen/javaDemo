package com.pcc.lc.node;

/**
 * @author peichenchen
 * @date 2020/05/24
 */
public class Test {

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

        ListNode node = new SwapNodesInPairs().swapPairs(a1);

        print(node);
    }

    private static void print(ListNode node) {
        //打印输出结果
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            System.out.print(node != null ? "->" : "");
        }
    }

}
