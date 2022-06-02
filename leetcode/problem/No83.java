package leetcode.problem;

import leetcode.base.ListNode;

/**
 * @Description https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/ - 删除排序链表中的重复元素
 * @Author dohongyu
 * @Data 2021/9/18 17:55
 **/
public class No83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}