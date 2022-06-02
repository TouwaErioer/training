package leetcode.problem.longestPalindrome;

/**
 * @Description 最长回文子串（暴力） - https://leetcode-cn.com/problems/longest-palindromic-substring/
 * @Author dohongyu
 * @Data 2021/9/24 19:18
 **/
public class solve1 {

    // 判断是否为回文数
    public boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String substring = s.substring(i, j);
                if (isPalindromic(substring) && substring.length() > max) {
                    ans = substring;
                    max = ans.length();
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new solve1().longestPalindrome("acacaba"));
    }
}
