package leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description https://leetcode-cn.com/problems/minimum-absolute-difference/
 * @Author TouwaErioer
 * @Data 2022/3/9 19:36
 **/
public class No1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int length = arr.length;
        int min = Math.abs(arr[1] - arr[0]);
        for (int i = 1; i < length; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i - 1]));
        }
        for (int j = 0; j < length - 1; j++) {
            if (arr[j] + min == arr[j + 1]) {
                ans.add(new ArrayList<>(Arrays.asList(arr[j], arr[j + 1])));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 1, 3};
        List<List<Integer>> ans = new No1200().minimumAbsDifference(arr);
        System.out.println(ans);
    }
}
