package recursion;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * Usage: 递归程序 <br/>
 * Date: 2023/5/15 13:29 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class RecursionTest {
    @Test
    public void dirNameTest() throws IOException {
        Recursion recursion = new Recursion();
        recursion.dirName(Paths.get("src/main/java/recursion/dir"));
    }
}
