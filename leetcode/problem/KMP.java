package leetcode.problem;

/**
 * @Description
 * @Author dohongyu
 * @Data 2021/10/20 19:30
 **/
public class KMP {

    public int[] getNext(String s) {
        int len = s.length();
        int[] next = new int[len];
        char[] p = s.toCharArray();
        next[0] = 0;
        int k = 0;
        int i = 1;
        while (i < len) {
            while (k > 0 && p[k] != p[i]) {
                k = next[k - 1];
            }
            if (p[k] == p[i]) {
                k++;
            }
            next[i] = k;
            i++;
        }
        return next;
    }

    public int longestPrefix(String s, String pattern) {
        char[] p = pattern.toCharArray();
        int[] next = getNext(pattern);
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            while (j < p.length && i < s.length() && s.charAt(i) == p[j]) {
                if (j == p.length - 1) {
                    return i - j;
                }
                j++;
                i++;
            }
            if (j > 1) {
                j = j - next[j - 1];
            }
            i++;
        }
        return -1; //不匹配
    }

    public static void main(String[] args) {
        KMP kmp = new KMP();
        System.out.println(kmp.longestPrefix("aaaaaaaba", "aaaaab"));
    }
}
