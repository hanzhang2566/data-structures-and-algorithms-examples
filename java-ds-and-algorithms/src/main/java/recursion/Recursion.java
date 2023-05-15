package recursion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Usage: 递归 <br/>
 * Date: 2023/5/15 13:05 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class Recursion {
    public void foreach(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.println("i = " + i);
        }
    }

    public void recurse(int num) {
        if (num < 0) {
            return;
        }
        System.out.println("num = " + num);
        recurse(num - 1);
    }

    // factorial(1) return 1;
    // factorial(2) return 2 * factorial(1) = return 2 * 1 = return 2;
    // factorial(3) return 3 * factorial(2) = 3 * 2 * factorial(1) = return 3 * 2 * 1 = return 2;
    public int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.foreach(9);
        recursion.recurse(9);

        int factorial = recursion.factorial(3);
        System.out.println("factorial = " + factorial);
    }

    public void dirName(Path src) throws IOException {
        // 目录不存在直接返回
        if (!Files.exists(src)) {
            return;
        }
        if (Files.isRegularFile(src)) {
            return;
        }
        List<Path> paths = Files.list(src).collect(Collectors.toList());
        for (Path p : paths) {
            System.out.println(p.getFileName());
            dirName(p);
        }
    }
}
