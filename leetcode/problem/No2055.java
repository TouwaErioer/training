package leetcode.problem;

/**
 * @Description https://leetcode-cn.com/problems/plates-between-candles/
 * @Author TouwaErioer
 * @Data 2022/3/8 14:17
 **/
public class No2055 {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] perSum = new int[n];
        for (int i = 0, sum = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                sum += 1;
            }
            perSum[i] = sum;
        }
        int[] left = new int[n];
        for (int i = 0, l = -1; i < n; i++) {
            if (s.charAt(i) == '|') {
                l = i;
            }
            left[i] = l;
        }
        int[] right = new int[n];
        for (int i = n - 1, r = -1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                r = i;
            }
            right[i] = r;
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int x = right[query[0]], y = left[query[1]];
            ans[i] = x == -1 || y == -1 || x > y ? 0 : perSum[y] - perSum[x];
        }
        return ans;
    }

    public static void main(String[] args) {
        No2055 no2055 = new No2055();
        for (int result : no2055.platesBetweenCandles("***|**|*****|**||**|*", new int[][]{{1, 17}, {4, 5}, {14, 17}, {5, 11}, {15, 16}})) {
            System.out.println(result);
        }
    }
}
