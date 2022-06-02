package leetcode.problem.containerWithMostWater;

/**
 * @Description https://leetcode-cn.com/problems/container-with-most-water/ - 盛最多水的容器
 * @Author dohongyu
 * @Data 2021/9/27 19:40
 **/
public class solve1 {


    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            if (height[i] < height[j])
                res = Math.max(res, (j - i) * height[i++]);
            else
                res = Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new solve1().maxArea(new int[]{1, 1}));
    }
}
