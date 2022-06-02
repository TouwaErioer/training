package leetcode.problem.monotoneStack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Description https://leetcode-cn.com/problems/daily-temperatures/
 * @Author dohongyu
 * @Data 2021/12/16 11:18
 **/
public class No739 {

    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        // 存索引
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            // 把比当前温度低的温度出栈
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        No739 no739 = new No739();
        System.out.println(Arrays.toString(no739.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}
