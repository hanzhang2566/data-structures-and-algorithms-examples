package exercise;

import org.junit.Test;

import java.util.Arrays;

/**
 * Usage: {@link SkipElementInArray} 测试 <br/>
 * Date: 2023/5/4 11:56 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SkipElementInArrayTest {
    @Test
    public void wrong01() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        SkipElementInArray skipElementInArray = new SkipElementInArray();
        int[] result = skipElementInArray.wrong(nums);

        // output: [1, 3, 5, 7, 0]
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    @Test
    public void wrong02() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        SkipElementInArray skipElementInArray = new SkipElementInArray();
        int[] result = skipElementInArray.wrong(nums);

        // output: [1, 3, 5, 7, 9]
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    @Test
    public void right01() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        SkipElementInArray skipElementInArray = new SkipElementInArray();
        int[] result = skipElementInArray.right(nums);

        // output: [1, 3, 5, 7, 0]
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    @Test
    public void right02() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        SkipElementInArray skipElementInArray = new SkipElementInArray();
        int[] result = skipElementInArray.right(nums);

        // output: [1, 3, 5, 7, 9]
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
}
