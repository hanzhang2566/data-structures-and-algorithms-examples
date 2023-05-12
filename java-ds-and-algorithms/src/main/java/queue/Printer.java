package queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Usage: 打印机 <br/>
 * Date: 2023/5/12 15:56 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Printer {
    private final Deque<String> queue = new ArrayDeque<>();

    public void print(String user, String text) {
        queue.offerLast(user + "=> " + text);
    }

    public void handle() {
        while (!queue.isEmpty()) {
            String text = queue.pollFirst();
            System.out.println("打印：" + text + "。剩余： " + queue.size());
        }
    }
}
