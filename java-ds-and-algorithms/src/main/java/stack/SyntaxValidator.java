package stack;

import java.util.*;

/**
 * Usage: 用栈来模拟括号匹配 <br/>
 * Date: 2023/5/11 9:46 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
public class SyntaxValidator {
    private final Deque<Character> stack = new ArrayDeque<>();

    private final List<Character> allBrackets = Arrays.asList('(', ')', '[', ']', '{', '}');

    private final Map<Character, Character> braces = new HashMap<>(3);

    public SyntaxValidator() {
        braces.put(')', '(');
        braces.put(']', '[');
        braces.put('}', '{');
    }


    /**
     * 判断输入文本的
     *
     * @param text 文本
     * @return 是否完成
     */
    public boolean barcketMatch(String text) {
        for (char c : text.toCharArray()) {
            if (!allBrackets.contains(c)) {
                continue;
            }

            if (!braces.containsKey(c)) {
                stack.offerLast(c);
                continue;
            }
            Character pollLast = stack.pollLast();
            if (Objects.isNull(pollLast)) {
                System.out.println("只有右括号，没有左括号");
                return false;
            }
            if (!Objects.equals(pollLast, braces.get(c))) {
                System.out.println("左右括号不匹配");
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("只有左括号，没有右括号");
            return false;
        }
        return true;
    }
}
