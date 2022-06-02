package leetcode.problem.longestPalindrome;

/**
 * @Description 最长回文子串（扩展中心） - https://leetcode-cn.com/problems/longest-palindromic-substring/
 * @Author dohongyu
 * @Data 2021/9/24 19:31
 **/
public class solve2 {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return s;
        int maxLen = 0;
        // 第一位记录起始位置，第二位记录长度
        int[] res = new int[2];
        for (int i = 0; i < s.length(); i++) {
            // 奇数
            int[] odd = expandAroundCenter(s, i, i);
            // 偶数
            int[] even = expandAroundCenter(s, i, i + 1);
            int[] max = odd[1] > even[1] ? odd : even;
            if (max[1] > maxLen) {
                res = max;
                maxLen = max[1];
            }
        }
        return s.substring(res[0], res[0] + res[1]);
    }

    /**
     * 扩展中心
     *
     * @param s     目标字符串
     * @param left  左边界
     * @param right 有边界
     * @return 只包含两个元素的数组，第一位记录起始位置，第二位记录长度
     */
    private int[] expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return new int[]{L + 1, R - L - 1};
    }

    public static void main(String[] args) {
        System.out.println(new solve2().longestPalindrome("acacaba"));
    }
}
