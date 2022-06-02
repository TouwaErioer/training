package leetcode.base;

/**
 * @Description ListNode
 * @Author dohongyu
 * @Data 2021/9/18 17:56
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        ListNode current = this;
        while (current.next != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
