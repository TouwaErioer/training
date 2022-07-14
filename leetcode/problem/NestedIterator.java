package leetcode.problem;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Description https://leetcode.cn/problems/flatten-nested-list-iterator/
 * @Author duhongyu
 * @Data 2022/7/14 15:17
 **/
public class NestedIterator implements Iterator<Integer> {


    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        List<NestedInteger> getList();
    }

    private Queue<Integer> nestedQueue;

    public NestedIterator(List<NestedInteger> nestedList) {
        nestedQueue = new LinkedBlockingDeque<>();
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                nestedQueue.offer(nestedInteger.getInteger());
            } else {
                pushStack(nestedInteger.getList());
            }
        }
    }

    /**
     * 递归把 value 推入 queue
     *
     * @param nestedIntegerList nestedInteger 列表
     */
    private void pushStack(List<NestedInteger> nestedIntegerList) {
        for (NestedInteger value : nestedIntegerList) {
            if (value.isInteger()) {
                nestedQueue.offer(value.getInteger());
            } else {
                pushStack(value.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return nestedQueue.poll();
    }

    @Override
    public boolean hasNext() {
        return !nestedQueue.isEmpty();
    }
}
