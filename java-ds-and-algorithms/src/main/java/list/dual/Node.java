package list.dual;

import lombok.Data;
import lombok.ToString;

/**
 * Usage: 双端链表节点 <br/>
 * Date: 2023/5/22 15:56 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Node {
    private Node previous;
    private Node next;
    private int val;


    public Node(int val) {
        this.val = val;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
