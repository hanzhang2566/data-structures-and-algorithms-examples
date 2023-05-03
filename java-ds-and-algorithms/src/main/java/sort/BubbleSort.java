package sort;

/**
 * Usage: 冒泡排序 <br/>
 * Date: 2023/5/3 20:37 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class BubbleSort {
    /**
     * 冒泡排序每循环一次，会固定一个最大值到数组末尾
     *
     * @param nums 待排序数组
     */
    public void sort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }

        // flag 用来处理已经排序完成时，不用重复循环的情况
        boolean flag = false;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    flag = true;
                    swap(nums, j, j + 1);
                }
            }
            if (!flag) {
                break;
            }
            flag = false;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
