package exercise;

import org.junit.Test;

import java.util.Arrays;

/**
 * Usage:  <br/>
 * Date: 2023/5/9 11:11 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class InsertTwoArrayTest {

    @Test
    public void wrong01() {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{4, 5, 6};
        InsertTwoArray insertTwoArray = new InsertTwoArray();
        int[] result = insertTwoArray.wrong(nums1, nums2);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    @Test
    public void wrong02() {
        int[] nums1 = new int[]{1, 2, 3, 4};
        int[] nums2 = new int[]{4, 5, 6};
        InsertTwoArray insertTwoArray = new InsertTwoArray();
        int[] result = insertTwoArray.wrong(nums1, nums2);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    @Test
    public void right01() {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{4, 5, 6};
        InsertTwoArray insertTwoArray = new InsertTwoArray();
        int[] result = insertTwoArray.right(nums1, nums2);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    @Test
    public void right02() {
        int[] nums1 = new int[]{1, 2, 3, 4};
        int[] nums2 = new int[]{4, 5, 6};
        InsertTwoArray insertTwoArray = new InsertTwoArray();
        int[] result = insertTwoArray.right(nums1, nums2);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
}
