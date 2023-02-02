package leetcode.problem;

import leetcode.base.ListNode;

/**
 * @Description https://leetcode.cn/problems/merge-in-between-linked-lists/
 * @Author duhongyu
 * @Data 2023/1/30 17:25
 **/
public class No1669 {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode preA = list1;
        for (int i = 0; i < a - 1; i++) {
            preA = preA.next;
        }
        ListNode perB = preA;
        for (int i = 0; i < b - a + 2; i++) {
            perB = perB.next;
        }
        preA.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = perB;
        return list1;
    }
}
