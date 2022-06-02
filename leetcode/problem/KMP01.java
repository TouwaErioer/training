package leetcode.problem;

/**
 * @Description
 * @Author dohongyu
 * @Data 2021/11/4 14:00
 **/
public class KMP01 {
    // a working example
    public static void main(String[] args) {
        final String haystack = "aaaaaaaba"; // This is the full string
        final String needle = "aaaaab"; // This is the substring that we want to find
        System.out.println(KMPmatcher(haystack, needle));
    }

    // find the starting index in string haystack[] that matches the search word P[]
    public static int KMPmatcher(final String haystack, final String needle) {
        final int m = haystack.length();
        final int n = needle.length();
        final int[] pi = computePrefixFunction(needle);
        // 已匹配的字符串长度
        int q = 0;
        for (int i = 0; i < m; i++) {
            while (q > 0 && haystack.charAt(i) != needle.charAt(q)) {
                q = pi[q - 1];
            }

            if (haystack.charAt(i) == needle.charAt(q)) {
                q++;
            }

            if (q == n) {
                return i + 1 - n;
            }
        }
        return -1;
    }

    // return the prefix function
    private static int[] computePrefixFunction(final String P) {
        final int n = P.length();
        final int[] pi = new int[n];
        pi[0] = 0;
        int q = 0;
        for (int i = 1; i < n; i++) {
            while (q > 0 && P.charAt(q) != P.charAt(i)) {
                q = pi[q - 1];
            }

            if (P.charAt(q) == P.charAt(i)) {
                q++;
            }

            pi[i] = q;
        }
        return pi;
    }
}