package leetcode.problem;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Description https://leetcode-cn.com/problems/reverse-words-in-a-string/
 * @Author TouwaErioer
 * @Data 2022/1/18 15:00
 **/
public class No151 {

    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(s.trim().split(" ")));
        StringBuilder buffer = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            String value = stack.pop();
            if (i != size - 1) {
                value = value.concat(" ");
            }
            buffer.append(value);
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No151().reverseWords("the sky is blue"));
    }
}
