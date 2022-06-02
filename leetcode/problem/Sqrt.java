package leetcode.problem;

/**
 * @Description https://leetcode-cn.com/problems/sqrtx/
 * @Author dohongyu
 * @Data 2021/12/14 15:23
 **/
public class Sqrt {

    public int solution(int x) {
        int left = 0, right = x;
        while (left < right) {
            int mid = (left + right + 1) >>> 1;
            if (mid <= x /mid) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        System.out.println(sqrt.solution(2147395599));
    }
}
