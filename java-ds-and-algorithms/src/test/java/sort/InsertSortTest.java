package sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Usage: {@link InsertSort} 测试 <br/>
 * Date: 2023/5/4 21:36 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class InsertSortTest {
    @Test
    public void test01() {
        int[] nums = new int[]{4, 2, 7, 1, 3};
        InsertSort insertSort = new InsertSort();
        insertSort.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }
}
