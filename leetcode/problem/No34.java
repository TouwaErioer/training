package leetcode.problem;

import java.util.Arrays;

/**
 * @Description https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @Author dohongyu
 * @Data 2021/12/13 16:41
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

    private int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, size = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                size = mid;
            } else {
                left = mid + 1;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new No34().searchRange(new int[]{1, 1, 2, 3, 3, 5, 5, 5, 6, 6, 9}, 5)));
    }
}
