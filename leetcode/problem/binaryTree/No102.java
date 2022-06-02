package leetcode.problem.binaryTree;

import leetcode.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description https://leetcode.cn/problems/binary-tree-level-order-traversal/
 * @Author TouwaErioer
 * @Data 2022/6/2 10:52
 **/
public class No102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                TreeNode current = queue.poll();
                if (current != null) {
                    level.add(current.val);
                    if (current.left != null) {
                        queue.offer(current.left);
                    }
                    if (current.right != null) {
                        queue.offer(current.right);
                    }
                }
            }
            ret.add(level);
        }
        return ret;
    }
}
