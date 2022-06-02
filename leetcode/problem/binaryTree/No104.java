package leetcode.problem.binaryTree;

import leetcode.base.TreeNode;

/**
 * @Description https://leetcode.cn/problems/maximum-depth-of-binary-tree/
 * @Author TouwaErioer
 * @Data 2022/6/2 14:52
 **/
public class No104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
