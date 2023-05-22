package list;


/**
 * Usage: 链表接口 <br/>
 * Date: 2023/5/22 16:06 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public interface List {
    /**
     * 读取下标节点，不存在返回 null
     *
     * @param index 下标
     * @return Node
     */
    BaseNode read(int index);

    /**
     * 通过 val 查询节点，不存在返回 null
     *
     * @param val val
     * @return Node
     */
    BaseNode lookup(int val);

    /**
     * 给下标插入 val
     *
     * @param index 下标
     * @param val   val
     * @return boolean
     */
    boolean insert(int index, int val);

    /**
     * 删除下标的节点
     *
     * @param index 下标
     * @return boolean
     */
    boolean remove(int index);
}
