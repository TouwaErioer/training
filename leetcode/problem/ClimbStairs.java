package leetcode.problem;

/**
 * @Description
 * @Author dohongyu
 * @Data 2021/12/3 20:03
 **/
// 1. 定义子问题
// 2. 写出子问题的递推关系
// 3. 确定 DP 数组的计算顺序
public class ClimbStairs {
    public int solution(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new ClimbStairs().solution(3));
    }
}
