package queue;

import org.junit.Test;

/**
 * Usage: 队列测试 <br/>
 * Date: 2023/5/12 15:59 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class PrinterTest {
    @Test
    public void test01() {
        Printer printer = new Printer();
        printer.print("hanzhang", "hello hanzhang");
        printer.print("zhanghan", "hello zhanghan");

        printer.handle();
    }
}
