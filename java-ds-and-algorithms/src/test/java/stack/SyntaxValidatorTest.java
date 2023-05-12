package stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * Usage: {@link SyntaxValidator} 测试 <br/>
 * Date: 2023/5/11 9:53 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SyntaxValidatorTest {
    @Test
    public void test01() {
        SyntaxValidator validator = new SyntaxValidator();
        boolean match = validator.barcketMatch("(hello)");
        Assert.assertEquals(true, match);
    }

    @Test
    public void test02() {
        SyntaxValidator validator = new SyntaxValidator();
        boolean match = validator.barcketMatch("(hello]");
        Assert.assertEquals(false, match);
    }

    @Test
    public void test03() {
        SyntaxValidator validator = new SyntaxValidator();
        boolean match = validator.barcketMatch("(hello");
        Assert.assertEquals(false, match);
    }

    @Test
    public void test04() {
        SyntaxValidator validator = new SyntaxValidator();
        boolean match = validator.barcketMatch("[(hello");
        Assert.assertEquals(false, match);
    }

    @Test
    public void test05() {
        SyntaxValidator validator = new SyntaxValidator();
        boolean match = validator.barcketMatch("hello)");
        Assert.assertEquals(false, match);
    }

    @Test
    public void test06() {
        SyntaxValidator validator = new SyntaxValidator();
        boolean match = validator.barcketMatch("(hello)]");
        Assert.assertEquals(false, match);
    }

    @Test
    public void test07() {
        SyntaxValidator validator = new SyntaxValidator();
        boolean match = validator.barcketMatch("{[(hello)]}");
        Assert.assertEquals(true, match);
    }

    @Test
    public void test08() {
        SyntaxValidator validator = new SyntaxValidator();
        boolean match = validator.barcketMatch("{[(hello)]");
        Assert.assertEquals(false, match);
    }

    @Test
    public void test09() {
        SyntaxValidator validator = new SyntaxValidator();
        boolean match = validator.barcketMatch("[(hello)]}");
        Assert.assertEquals(false, match);
    }
}
