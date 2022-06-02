package leetcode.problem;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description https://leetcode-cn.com/problems/intersection-of-two-arrays/ - 两个数组的交集
 * @Author dohongyu
 * @Data 2021/9/18 17:30
 **/
public class No349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        for (int n : nums2) {
            if (contains(nums1, n))
                res.add(n);
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    private boolean contains(int[] nums, int n) {
        for (int i : nums) {
            if (i == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] res = new No349().intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        for (int n : res)
            System.out.println(n);
    }
}
