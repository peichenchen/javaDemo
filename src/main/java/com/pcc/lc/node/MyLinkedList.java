package com.pcc.lc.node;

/**
 * @author peichenchen
 * @date 2019/03/03
 */
class MyLinkedList {

    private int length;

    private Node head;

    private Node tail;

    private class Node {
        private int val;

        private Node next;

        public Node(int val) {
            this.val = val;
        }

    }

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {

        Node node = this.getNode(index);

        return node != null ? node.val : -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node node = new Node(val);

        node.next = head;

        if (head == null) {
            tail = node;
        }

        head = node;
        length++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node node = new Node(val);

        if (tail != null) {
            tail.next = node;
        } else {
            head = node;
        }

        tail = node;
        length++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > length) {
            return;
        }

        if (index == length) {
            addAtTail(val);
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node cur = new Node(val);
        Node pre = getNode(index - 1);

        cur.next = pre.next;
        pre.next = cur;

        length++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {

        if (index == 0) {
            this.deleteHead();
        } else if (index > 0 && index < length) {
            Node prev = this.getNode(index - 1);
            Node cur = prev.next;
            prev.next = cur.next;

            if (index == length - 1) {
                tail = prev;
            }
            length--;
        } else {
            return;
        }

    }

    private void deleteHead() {
        if (head == null) {
            return;
        }

        if (length == 1) {
            head = null;
            tail = null;
            length--;
        } else {
            head = head.next;
        }
    }

    private Node getNode(int index) {
        if (index < 0 || index > length - 1 || head == null) {
            return null;
        }

        Node cur = head;
        while (cur != null && index > 0) {
            index--;
            cur = cur.next;
        }

        return cur;
    }
}
