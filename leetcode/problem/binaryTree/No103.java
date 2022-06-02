package leetcode.problem.binaryTree;

import leetcode.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description https://leetcode.cn/problems/binary-tree-zigzag-level-order-traversal/
 * @Author TouwaErioer
 * @Data 2022/6/2 11:15
 **/
public class No103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isLeft = true;
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    if (isLeft) {
                        level.add(node.val);
                    } else {
                        level.add(0, node.val);
                    }
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            ret.add(level);
            isLeft = !isLeft;
        }
        return ret;
    }
}
