package list.dual;

import lombok.Data;

import java.util.Objects;

/**
 * Usage: 双向链表 <br/>
 * Date: 2023/5/22 16:03 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
@Data
public class LinkedList {
    /**
     * 长度
     */
    private int length;

    private Node head;

    public LinkedList(Node head) {
        this.head = head;
        length = 0;
    }

    public Node read(int index) {
        if (index < 0 || index > length) {
            return null;
        }
        int curIndex = 0;
        Node curNode = head.getNext();
        while (curIndex < index) {
            curNode = curNode.getNext();
            curIndex++;
        }
        return curNode;
    }

    public Node lookup(int val) {
        Node curNode = head.getNext();
        while (Objects.nonNull(curNode)) {
            if (curNode.getVal() == val) {
                return curNode;
            }
            curNode = curNode.getNext();
        }
        return null;
    }

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
        Node next = curNode.getNext();
        Node node = new Node(val);
        if (Objects.isNull(next)) {
            curNode.setNext(node);
            node.setPrevious(curNode);
        } else {
            node.setNext(curNode.getNext());
            node.setPrevious(curNode);

            curNode.getNext().setPrevious(node);
            curNode.setNext(node);
        }
        length++;
        return true;
    }

    public boolean remove(int index) {
//        if (index < 0 || index < length) {
//            return false;
//        }
//        Node curNode = head;
//        int curIndex = 0;
//        while (curIndex < index) {
//            curNode = curNode.getNext();
//            curIndex++;
//        }
//        Node next = curNode.getNext();
//        if (Objects.isNull(next)) {
//            curNode.setNext(null);
//        } else {
//            curNode.getNext().getNext().setPrevious(curNode);
//            curNode.setNext(curNode.getNext().getNext());
//        }
        // FIXME
        return true;
    }

    @Override
    public String toString() {
        Node curNode = head.getNext();
        int count = 1;
        StringBuilder sb = new StringBuilder("{");
        while (Objects.nonNull(curNode)) {
            int val = curNode.getVal();
            sb.append(count);
            sb.append(":");
            sb.append(val);
            sb.append(",");
            count++;
            curNode = curNode.getNext();
        }
        sb = new StringBuilder(sb.substring(0, sb.length() - 1)).append("}");
        return sb.toString();
    }
}
