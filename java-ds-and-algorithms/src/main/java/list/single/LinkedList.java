package list.single;

import list.List;
import lombok.Data;

import java.util.Objects;

/**
 * Usage: 链表 <br/>
 * Date: 2023/5/17 15:02 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
@Data
public class LinkedList implements List {
    private Node head;

    private int length;

    public LinkedList(Node head) {
        this.head = head;
        length = 0;
    }

    @Override
    public Node read(int index) {
        if (index < 0 || index > length) {
            return null;
        }

        Node curNode = head.getNext();
        int curIndex = 0;
        while (curNode != null && curIndex < index) {
            curNode = curNode.getNext();
            curIndex++;
        }
        if (Objects.isNull(curNode)) {
            return null;
        }
        return curNode;
    }

    @Override
    public Node lookup(int val) {
        Node curNode = head;
        while (curNode != null) {
            if (val == curNode.getVal()) {
                return curNode;
            }
            curNode = curNode.getNext();
        }

        return null;
    }

    @Override
    public boolean insert(int index, int val) {
        if (index < 0 || index > length) {
            return false;
        }
        int curIndex = 0;
        Node curNode = head;
        while (curIndex < index) {
            curNode = curNode.getNext();
            curIndex++;
        }
        Node node = new Node(val);
        node.setNext(curNode.getNext());
        curNode.setNext(node);
        length++;
        return true;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index > length - 1) {
            return false;
        }

        int curIndex = 0;
        Node curNode = head;
        while (curIndex < index) {
            curNode = curNode.getNext();
            curIndex++;
        }
        curNode.setNext(curNode.getNext().getNext());
        length--;
        return true;
    }
}
