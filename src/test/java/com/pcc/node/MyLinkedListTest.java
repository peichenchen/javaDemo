package com.pcc.node;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author peichenchen
 * @date 2019/03/03
 */
public class MyLinkedListTest {

    MyLinkedList linkedList = new MyLinkedList();

    @Before
    public void init() {
        linkedList = new MyLinkedList();
    }

    @Test
    public void get() {
        Assert.assertEquals(-1, linkedList.get(0));
        Assert.assertEquals(-1, linkedList.get(-1));
        Assert.assertEquals(-1, linkedList.get(1));
    }

    @Test
    public void addAtHead() {
        linkedList.addAtHead(3);
        linkedList.addAtHead(2);
        linkedList.addAtHead(1);

        Assert.assertEquals(1, linkedList.get(0));
        Assert.assertEquals(2, linkedList.get(1));
        Assert.assertEquals(3, linkedList.get(2));
    }

    @Test
    public void addAtTail() {
        linkedList.addAtTail(1);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);

        Assert.assertEquals(1, linkedList.get(0));
        Assert.assertEquals(2, linkedList.get(1));
        Assert.assertEquals(3, linkedList.get(2));
    }

    @Test
    public void addAtIndex() {
        linkedList.addAtIndex(-1, 1);
        Assert.assertEquals(-1, linkedList.get(0));

        linkedList.addAtIndex(100, 1);
        Assert.assertEquals(-1, linkedList.get(0));

        linkedList.addAtIndex(0, 1);
        Assert.assertEquals(1, linkedList.get(0));


        linkedList.addAtIndex(1, 2);
        linkedList.addAtIndex(2, 3);

        Assert.assertEquals(3, linkedList.get(2));
    }

    @Test
    public void deleteAtIndex() {

        linkedList.addAtTail(1);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);
        Assert.assertEquals(1, linkedList.get(0));

        linkedList.deleteAtIndex(-1);
        linkedList.deleteAtIndex(100);
        linkedList.deleteAtIndex(0);
        Assert.assertEquals(2, linkedList.get(0));

        linkedList.deleteAtIndex(1);
        Assert.assertEquals(2, linkedList.get(0));
        Assert.assertEquals(4, linkedList.get(1));
    }

    @Test
    public void test() {

        linkedList.addAtHead(34);
        System.out.printf(linkedList.toString());

        linkedList.deleteAtIndex(1);
        linkedList.addAtIndex(1, 20);
        linkedList.addAtHead(7);
        linkedList.addAtTail(21);
        linkedList.addAtTail(70);
        linkedList.deleteAtIndex(3);
        linkedList.addAtTail(54);
        linkedList.addAtIndex(3, 35);
        linkedList.addAtTail(33);
        linkedList.addAtTail(84);
        linkedList.addAtTail(83);
        linkedList.get(7);

        Assert.assertEquals(84, linkedList.get(7));
    }
}