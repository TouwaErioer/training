package leetcode.problem;

import leetcode.base.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/
 * @Author TouwaErioer
 * @Data 2022/3/21 13:39
 **/
public class No653 {

    Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
