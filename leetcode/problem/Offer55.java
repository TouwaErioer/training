package leetcode.problem;

import leetcode.base.TreeNode;

/**
 * @Description https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 * @Author TouwaErioer
 * @Data 2022/3/11 16:02
 **/
public class Offer55 {

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
