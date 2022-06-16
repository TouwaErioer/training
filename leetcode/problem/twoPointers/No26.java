package leetcode.problem.twoPointers;

/**
 * @Description https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 * @Author duhongyu
 * @Data 2022/6/16 17:03
 **/
public class No26 {

    public int removeDuplicates(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
            if (nums[slowIndex] != nums[fastIndex]) {
                slowIndex++;
                nums[slowIndex] = nums[fastIndex];
            }
        }
        return slowIndex + 1;
    }
}
