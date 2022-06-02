package leetcode.problem;

import leetcode.base.TreeNode;

/**
 * @Description https://leetcode-cn.com/problems/range-sum-of-bst/
 * @Author TouwaErioer
 * @Data 2022/1/10 17:50
 **/
public class No938 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        if (root.val > high)
            return rangeSumBST(root.left, low, high);
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
