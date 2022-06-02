package leetcode.problem;

/**
 * @Description https://leetcode-cn.com/problems/perfect-number/
 * @Author TouwaErioer
 * @Data 2022/1/10 16:20
 **/
public class No507 {

    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int ans = 1;
        for (int i = 2; i < num / i; i++) {
            if (num % i == 0) {
                ans += i;
                if (i * i != num) ans += num / i;
            }
        }
        return ans == num;
    }

    public static void main(String[] args) {
        System.out.println(new No507().checkPerfectNumber(28));
    }
}