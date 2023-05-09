package sort;

/**
 * Usage: 插入排序 <br/>
 * Date: 2023/5/4 21:35 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class InsertSort {
    /**
     * 插入排序每次选一个未排序的元素，比较之前元素以确定插入元素的下标
     *
     * @param nums 待排序数组
     */
    public void sort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }

        for (int i = 0; i < length; i++) {
            int pos = i;
            int value = nums[i];
            // 将选定元素与之前元素进行比较，确定最终位置
            while (pos > 0 && nums[pos - 1] > value) {
                nums[pos] = nums[pos - 1];
                pos--;
            }
            nums[pos] = value;
        }
    }
}
