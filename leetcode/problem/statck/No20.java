package leetcode.problem.statck;

import java.util.Stack;

/**
 * @Description https://leetcode.cn/problems/valid-parentheses/
 * @Author TouwaErioer
 * @Data 2022/6/2 15:02
 **/
public class No20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char right = stack.pop();
                if (c == ')' && right != '(') {
                    return false;
                }
                if (c == '}' && right != '{') {
                    return false;
                }
                if (c == ']' && right != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
