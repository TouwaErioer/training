package leetcode.problem;

/**
 * @Description https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/
 * @Author dohongyu
 * @Data 2021/12/15 17:18
 **/
public class No153 {
    public int findMin(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] <= nums[i + 1]) {
                continue;
            }
            return nums[i + 1];
        }
        return nums[0];
    }

    public static void main(String[] args) {
        No153 no153 = new No153();
        System.out.println(no153.findMin(new int[]{2,2,2,0,1}));
    }
}
