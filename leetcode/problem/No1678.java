package leetcode.problem;

/**
 * @Description https://leetcode.cn/problems/goal-parser-interpretation/
 * @Author duhongyu
 * @Data 2023/2/2 16:21
 **/
public class No1678 {

    public String interpret(String command) {
        StringBuilder res = new StringBuilder();
        char[] chars = command.toCharArray();
        for (int i = 0; i < command.length(); i++) {
            if (chars[i] == 'G') {
                res.append("G");
            } else if (chars[i] == '(' && chars[i + 1] == ')') {
                res.append("o");
                i++;
            } else {
                res.append("al");
                i += 3;
            }
        }
        return res.toString();
    }
}
