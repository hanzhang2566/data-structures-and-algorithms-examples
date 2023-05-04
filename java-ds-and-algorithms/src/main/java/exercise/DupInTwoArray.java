package exercise;

/**
 * Usage: 找出其中两个数组的交集 <br/>
 * Date: 2023/5/4 12:05 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class DupInTwoArray {
    // 双重遍历
    public int[] wrong(int[] nums1, int[] nums2) {
        int length = Math.min(nums1.length, nums2.length);
        int[] result = new int[length];

        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[index++] = nums1[i];
                }
            }
        }
        return result;
    }

    // 找到就不用遍历了
    public int[] right(int[] nums1, int[] nums2) {
        int length = Math.min(nums1.length, nums2.length);
        int[] result = new int[length];

        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[index++] = nums1[i];
                    break;
                }
            }
        }
        return result;
    }
}
