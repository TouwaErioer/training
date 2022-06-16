package leetcode.problem.binarySearch;

/**
 * @Description https://leetcode.cn/problems/search-insert-position/
 * @Author duhongyu
 * @Data 2022/6/16 10:55
 **/
public class No35 {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (target < nums[middle]) {
                right = middle - 1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return right + 1;
    }
}
