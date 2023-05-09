package exercise;

/**
 * Usage: 两个数组的交集 <br/>
 * Date: 2023/5/9 11:11 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class InsertTwoArray {
    public int[] wrong(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if (l1 == 0 || l2 == 0) {
            return new int[]{};
        }

        int[] ret = new int[Math.min(l1, l2)];
        int pos = 0;
        for (int n1 : nums1) {
            for (int n2 : nums2) {
                if (n1 == n2) {
                    ret[pos++] = n1;
                }
            }
        }

        return ret;
    }

    public int[] right(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if (l1 == 0 || l2 == 0) {
            return new int[]{};
        }

        int[] ret = new int[Math.min(l1, l2)];
        int pos = 0;
        for (int n1 : nums1) {
            for (int n2 : nums2) {
                if (n1 == n2) {
                    ret[pos++] = n1;
                    break;
                }
            }
        }

        return ret;
    }
}
