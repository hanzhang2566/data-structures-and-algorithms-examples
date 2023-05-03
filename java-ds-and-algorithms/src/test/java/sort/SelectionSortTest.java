package sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Usage: 选择排序测试 <br/>
 * Date: 2023/5/3 22:06 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SelectionSortTest {
    @Test
    public void test01() {
        int[] nums = new int[]{4, 2, 7, 1, 3};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }
}
