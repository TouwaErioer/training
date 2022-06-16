package leetcode.problem.binarySearch;

/**
 * @Description https://leetcode.cn/problems/sqrtx/
 * @Author duhongyu
 * @Data 2022/6/16 15:42
 **/
public class No69 {

    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = -1;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if ((long) middle * middle <= x) {
                left = middle + 1;
                ans = middle;
            } else {
                right = middle - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new No69().mySqrt(6));
    }
}
