package leetcode.problem.twoPointers;

/**
 * @Description https://leetcode.cn/problems/remove-element/submissions/
 * @Author duhongyu
 * @Data 2022/6/16 16:26
 **/
public class No27 {

    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        return slowIndex;
    }
}
