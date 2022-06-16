package leetcode.problem.binarySearch;

/**
 * @Description https://leetcode.cn/problems/valid-perfect-square/
 * @Author duhongyu
 * @Data 2022/6/16 15:53
 **/
public class No367 {

    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            long multiply = (long) middle * middle;
            if (multiply < num) {
                left = middle + 1;
            } else if (multiply > num) {
                right = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new No367().isPerfectSquare(6));
    }
}
