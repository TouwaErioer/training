package leetcode.problem.binarySearch;

/**
 * @Description https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @Author duhongyu
 * @Data 2022/6/16 15:08
 **/
public class No34 {

    public int[] searchRange(int[] nums, int target) {
        int leftIndex = binarySearch(nums, target, true);
        int rightIndex = binarySearch(nums, target, false) - 1;
        if (leftIndex <= rightIndex && rightIndex < nums.length && nums[leftIndex] == target && nums[rightIndex] == target) {
            return new int[]{leftIndex, rightIndex};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (target < nums[middle] || (lower && target <= nums[middle])) {
                right = middle - 1;
                ans = middle;
            } else {
                left = middle + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 5, 7, 8};
        int target = 1;
        int[] ans = new No34().searchRange(nums, target);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
