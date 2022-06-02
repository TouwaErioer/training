package leetcode.problem.monotoneStack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Description https://leetcode-cn.com/problems/next-greater-element-ii/
 * @Author dohongyu
 * @Data 2021/12/16 15:00
 **/
public class No503 {

    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 2 * n - 1; i >= 0; i--) {
            int num = nums[i % n];
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            result[i % n] = stack.isEmpty() ? -1 : stack.peek();
            stack.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
        No503 no503 = new No503();
        System.out.println(Arrays.toString(no503.nextGreaterElements(new int[]{1, 2, 1})));
    }
}
