package leetcode.problem.slidingWindow;

/**
 * @Description https://leetcode.cn/problems/minimum-size-subarray-sum/
 * @Author duhongyu
 * @Data 2022/6/17 14:03
 **/
public class No209 {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0; // 窗口起点
        int sum = 0; // 窗口内的和
        int ans = Integer.MAX_VALUE; // 结果
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}