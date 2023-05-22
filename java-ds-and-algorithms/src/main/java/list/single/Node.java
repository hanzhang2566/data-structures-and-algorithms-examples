package list.single;

import lombok.Data;

/**
 * Usage: 节点类 <br/>
 * Date: 2023/5/17 15:01 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
@Data
public class Node {
    private int val;

    private Node next;

    public Node(int val) {
        this.val = val;
    }
}
