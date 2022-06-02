package leetcode.problem;

import leetcode.base.TreeNode;

import java.util.ArrayList;

/**
 * @Description 二叉搜索树中第K小的元素 - https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 * @Author dohongyu
 * @Data 2021/10/15 17:03
 **/
public class No230 {

    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> array) {
        if (root == null) return array;
        inorder(root.left, array);
        array.add(root.val);
        inorder(root.right, array);
        return array;
    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> array = inorder(root, new ArrayList<Integer>());
        return array.get(k - 1);
    }
}
