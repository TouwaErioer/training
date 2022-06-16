package leetcode.problem.binarySearch;

/**
 * @Description https://leetcode.cn/problems/binary-search/
 * @Author duhongyu
 * @Data 2022/6/16 10:00
 **/
public class No704 {

    public int search(int[] nums, int target) {
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
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 5, 6, 9};
        int target = 2;
        System.out.println(new No704().search(nums, target));
    }
}
