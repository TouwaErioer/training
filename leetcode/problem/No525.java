package leetcode.problem;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description https://leetcode-cn.com/problems/contiguous-array/solution/lian-xu-shu-zu-by-leetcode-solution-mvnm/
 * @Author TouwaErioer
 * @Data 2022/3/8 17:39
 **/
public class No525 {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int counter = 0;
        Map<Integer, Integer> counterWithIndex = new HashMap<>();
        counterWithIndex.put(counter, -1);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 1) {
                counter++;
            } else {
                counter--;
            }
            if (counterWithIndex.containsKey(counter)) {
                int index = counterWithIndex.get(counter);
                maxLength = Math.max(maxLength, i - index);
            } else {
                counterWithIndex.put(counter, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new No525().findMaxLength(new int[]{0, 1}));
    }
}
