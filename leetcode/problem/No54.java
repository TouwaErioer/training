package leetcode.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description https://leetcode.cn/problems/spiral-matrix/
 * @Author TouwaErioer
 * @Data 2022/6/2 13:38
 **/
public class No54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        if (bottom < 0 || right < 0) {
            return ans;
        }
        while (true) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            if (++top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            if (--right < left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                ans.add(matrix[bottom][i]);
            }
            if (--bottom < top) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                ans.add(matrix[i][left]);
            }
            if (++left > right) {
                break;
            }
        }
        return ans;
    }
}
