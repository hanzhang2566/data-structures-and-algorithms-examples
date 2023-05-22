package list.single;

import list.BaseNode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Usage: 单链表节点 <br/>
 * Date: 2023/5/17 15:01 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Node extends BaseNode {

    private Node next;

    public Node(int val) {
        super.val = val;
    }
}
