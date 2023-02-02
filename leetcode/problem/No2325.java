package leetcode.problem;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description https://leetcode.cn/problems/decode-the-message/
 * @Author duhongyu
 * @Data 2023/2/1 15:47
 **/
public class No2325 {

    public String decodeMessage(String key, String message) {
        key = key.replace(" ", "");
        char cur = 'a';
        Map<Character, Character> map = new HashMap<>();
        char[] keys = key.toCharArray();
        for (Character k : keys) {
            if (!map.containsKey(k)) {
                map.put(k, cur);
                cur++;
            }
        }
        StringBuilder res = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                res.append(" ");
            } else {
                res.append(map.get(c));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No2325().decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }
}
