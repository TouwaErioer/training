package leetcode.problem;

import java.util.Stack;

/**
 * @Description https://leetcode-cn.com/problems/trapping-rain-water/
 * @Author TouwaErioer
 * @Data 2021/12/17 17:50
 **/
public class No42 {

    public int trap(int[] height) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int cur = stack.peek();
                stack.pop();
                if (stack.empty()) {
                    break;
                }
                int left = stack.peek();
                int right = i;
                int h = Math.min(height[left], height[right]) - height[cur];
                ans += (right - left - 1) * h;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        No42 no42 = new No42();
        System.out.println(no42.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
