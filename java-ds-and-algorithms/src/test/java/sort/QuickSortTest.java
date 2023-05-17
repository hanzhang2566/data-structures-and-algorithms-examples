package sort;

import org.junit.Assert;
import org.junit.Test;


/**
 * Usage: {@link QuickSort}测试 <br/>
 * Date: 2023/5/17 10:11 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class QuickSortTest {

    @Test
    public void sortTest01() {
        int[] nums = new int[]{0, 5, 2, 1, 6, 3};
        new QuickSort(nums).sort(0, nums.length - 1);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 5, 6}, nums);
    }
}
