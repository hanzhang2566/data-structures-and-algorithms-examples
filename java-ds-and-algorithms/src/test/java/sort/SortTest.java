package sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Usage: 排序测试 <br/>
 * Date: 2023/5/3 20:38 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SortTest {
    @Test
    public void bubbleTest() {
        int[] nums = new int[]{4, 2, 7, 1, 3};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }
}
