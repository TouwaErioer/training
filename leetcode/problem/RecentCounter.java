package leetcode.problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description https://leetcode-cn.com/problems/number-of-recent-calls/
 * @Author dohongyu
 * @Data 2021/12/16 11:15
 **/
public class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}