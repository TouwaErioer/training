package leetcode.problem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description https://leetcode-cn.com/problems/smallest-k-lcci/
 * @Author TouwaErioer
 * @Data 2022/3/11 16:21
 **/
public class Interview17_14 {

    public int[] smallestK(int[] arr, int k) {
        List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        return list.subList(0, k).stream()
                .mapToInt(x -> x).toArray();
    }
}
