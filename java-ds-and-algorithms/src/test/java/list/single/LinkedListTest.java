package list.single;

import list.single.LinkedList;
import list.single.Node;
import org.junit.Assert;
import org.junit.Test;

/**
 * Usage: 链表测试 <br/>
 * Date: 2023/5/17 15:03 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class LinkedListTest {
    @Test
    public void readTest01() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        one.setNext(two);
        two.setNext(three);
        three.setNext(four);

        Node head = new Node(0);
        head.setNext(one);
        LinkedList list = new LinkedList(head);
        Assert.assertEquals(3, list.read(2).getVal());
    }

    @Test
    public void readTest02() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        one.setNext(two);
        two.setNext(three);
        three.setNext(four);

        Node head = new Node(0);
        head.setNext(one);
        LinkedList list = new LinkedList(head);
        Assert.assertNull(list.read(4));
    }

    @Test
    public void lookupTest01() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        LinkedList list = new LinkedList(one);
        Assert.assertNull(list.lookup(5));
    }

    @Test
    public void lookupTest02() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        LinkedList list = new LinkedList(one);
        Node node = list.lookup(2);
        Assert.assertEquals(2, node.getVal());
    }

    // 越界插入
    @Test
    public void insertTest01() {
        Node head = new Node(0);
        LinkedList list = new LinkedList(head);
        Assert.assertFalse(list.insert(-1, -1));
        Assert.assertTrue(list.insert(0, 1));
        Assert.assertFalse(list.insert(2, 2));
    }

    // 带头节点的头插法
    @Test
    public void insertTest02() {
        Node head = new Node(0);
        LinkedList list = new LinkedList(head);
        list.insert(0, -1);
        list.insert(0, -2);
        Assert.assertEquals(2, list.getLength());
        System.out.println("list = " + list.getHead().getNext());
    }

    // 带头节点的尾插法
    @Test
    public void insertTest03() {
        Node head = new Node(0);
        LinkedList list = new LinkedList(head);
        list.insert(list.getLength(), 1);
        list.insert(list.getLength(), 2);
        Assert.assertEquals(2, list.getLength());
        System.out.println("list = " + list.getHead().getNext());
    }

    @Test
    public void insertTest04() {
        Node head = new Node(0);
        LinkedList list = new LinkedList(head);
        list.insert(0, -999);
        list.insert(list.getLength(), 999);
        list.insert(1, 1000);
        Assert.assertEquals(3, list.getLength());
        System.out.println("list = " + list.getHead().getNext());
    }

    // 越界删除
    @Test
    public void removeTest01() {
        Node head = new Node(0);
        LinkedList list = new LinkedList(head);
        Assert.assertFalse(list.remove(-1));
        Assert.assertFalse(list.remove(0));
        Assert.assertFalse(list.remove(1));
        Assert.assertFalse(list.remove(2));
    }

    // 带头节点的头插法
    @Test
    public void removeTest02() {
        Node head = new Node(0);
        LinkedList list = new LinkedList(head);
        list.insert(0, -1);
        list.insert(0, -2);
        Assert.assertEquals(2, list.getLength());
        list.remove(0);
        Assert.assertEquals(1, list.getLength());
        System.out.println(list.getHead().getNext());
    }

    // 带头节点的尾插法
    @Test
    public void removeTest03() {
        Node head = new Node(0);
        LinkedList list = new LinkedList(head);
        list.insert(list.getLength(), 1);
        list.insert(list.getLength(), 2);
        list.remove(0);
        list.remove(0);
        Assert.assertEquals(0, list.getLength());
        System.out.println("list = " + list.getHead().getNext());
    }
}
