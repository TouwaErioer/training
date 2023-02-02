package leetcode.problem;

/**
 * @Description https://leetcode.cn/problems/count-asterisks/
 * @Author duhongyu
 * @Data 2023/1/29 15:43
 **/
public class No2315 {

    public int countAsterisks(String s) {
        int line = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (line == 0 && c == '*') {
                count++;
            } else if (c == '|' && line == 0) {
                line++;
            } else if (c == '|' && line == 1) {
                line = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new No2315().countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }
}
