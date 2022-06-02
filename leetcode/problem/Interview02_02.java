package leetcode.problem;

import leetcode.base.ListNode;

/**
 * @Description https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 * @Author dohongyu
 * @Data 2021/12/15 19:30
 **/
public class Interview02_02 {
    public int kthToLast(ListNode head, int k) {
        ListNode slow = head, fast = head;
        while (k-- > 0) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }
}
