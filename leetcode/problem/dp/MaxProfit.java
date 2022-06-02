package leetcode.problem.dp;

/**
 * @Description https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/ - 买卖股票的最佳时机 II 时间复杂度：O(n)O(n)
 * @Author dohongyu
 * @Data 2021/9/29 13:40
 **/
public class MaxProfit {
    public int solve(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
}
