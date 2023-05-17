package sort;

/**
 * Usage: 快速排序 <br/>
 * Date: 2023/5/17 10:11 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class QuickSort {
    private final int[] nums;

    public QuickSort(int[] nums) {
        this.nums = nums;
    }

    public void sort(int head, int tail) {
        if (head >= tail) {
            return;
        }
        int left = head;
        int right = tail;

        while (left < right) {
            while (left < right && nums[left] < nums[head]) {
                left++;
            }
            while (left < right && nums[right] > nums[head]) {
                right--;
            }
            swap(nums, left, right);
        }
        swap(nums, left, head);
        sort(head, right - 1);
        sort(right + 1, tail);
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
