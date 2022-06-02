package leetcode.problem;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Description 数组中的第K个最大元素 - https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 * @Author dohongyu
 * @Data 2021/10/15 16:39
 **/
public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for(int n:nums){
            queue.offer(n);
            if(queue.size() > k){
                queue.poll();
            }
        }
        return queue.poll();
    }
}
