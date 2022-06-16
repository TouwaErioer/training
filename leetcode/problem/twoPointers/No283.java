package leetcode.problem.twoPointers;

/**
 * @Description https://leetcode.cn/problems/move-zeroes/
 * @Author duhongyu
 * @Data 2022/6/16 17:12
 **/
public class No283 {

    public void moveZeroes(int[] nums) {
        int right = nums.length - 1;
        for (int left = 0; left < nums.length; left++) {
            if(nums[left] == 0){
                nums[right - 1] = nums[right];
                nums[right] = nums[left];
            }
        }
    }
}
