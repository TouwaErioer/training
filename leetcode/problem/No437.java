package leetcode.problem;

import leetcode.base.TreeNode;

/**
 * @Description https://leetcode.cn/problems/path-sum-iii/
 * @Author duhongyu
 * @Data 2022/7/14 15:49
 **/
public class No437 {

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int res = dfs(root, targetSum);
        res += pathSum(root.left, targetSum);
        res += pathSum(root.right, targetSum);
        return res;
    }

    private int dfs(TreeNode root, int targetSum) {
        int res = 0;
        if (root == null) {
            return 0;
        }
        int value = root.val;
        if (value == targetSum) {
            res++;
        }
        res += dfs(root.left, targetSum - value);
        res += dfs(root.right, targetSum - value);
        return res;
    }
}
