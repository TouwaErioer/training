package leetcode.problem;

/**
 * @Description https://leetcode-cn.com/problems/find-peak-element/
 * @Author dohongyu
 * @Data 2021/12/14 15:37
 **/
public class No162 {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        No162 no162 = new No162();
        System.out.println(no162.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 5}));
    }
}
