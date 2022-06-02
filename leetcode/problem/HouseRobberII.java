package leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description https://leetcode-cn.com/problems/house-robber-ii/ 打家劫舍 II
 * @Author dohongyu
 * @Data 2021/12/3 19:03
 **/
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] odd = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] even = Arrays.copyOfRange(nums, 1, nums.length + 1);
        return Math.max(myRob(odd), myRob(even));
    }

    private int myRob(int[] nums) {
        List<Integer> dp = new ArrayList<>();
        dp.add(0);
        dp.add(0);
        for (int i = 2; i < nums.length + 2; i++) {
            // 当前的最大利益
            int current = dp.get(i - 2) + nums[i - 2];
            // dp里的上一个最大利益
            int pre = dp.get(i - 1);
            dp.add(Math.max(current, pre));
        }
        return dp.get(nums.length + 1);
    }


    public static void main(String[] args) {
        int[] target = new int[]{1, 2, 3, 5, 3, 3};
        int result = new HouseRobberII().rob(target);
        System.out.println(result);
    }
}