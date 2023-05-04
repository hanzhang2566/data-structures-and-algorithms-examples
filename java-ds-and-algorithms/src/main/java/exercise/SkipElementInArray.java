package exercise;

/**
 * Usage: 从一个数组里取出间隔的元素，来组成新的数组 <br/>
 * Date: 2023/5/4 11:51 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SkipElementInArray {
    // 计算下标结果后，进行插入
    public int[] wrong(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return nums;
        }

        int[] ret = new int[length / 2 + 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                // 插入
                ret[index] = nums[i];
                index++;
            }
        }
        return ret;
    }

    // 直接定位下标，进行插入
    public int[] right(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return nums;
        }

        int index = 0;
        int[] ret = new int[length / 2 + 1];
        for (int i = 0; i < length; i = i + 2) {
            // 插入
            ret[index] = nums[i];
            index++;
        }
        return ret;
    }
}
