package leetcode.problem;

/**
 * @Description https://leetcode-cn.com/problems/base-7/solution/qi-jin-zhi-shu-by-leetcode-solution-cl2v/
 * @Author TouwaErioer
 * @Data 2022/3/7 17:32
 **/
public class No504 {

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = num < 0;
        num = Math.abs(num);
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
            stringBuilder.append(num % 7);
            num /= 7;
        }
        if (negative) {
            stringBuilder.append("-");
        }
        return stringBuilder.reverse().toString();
    }
}
