package leetcode.problem;

/**
 * @Description https://leetcode.cn/problems/check-if-matrix-is-x-matrix/
 * @Author duhongyu
 * @Data 2023/1/31 15:22
 **/
public class No2319 {

    public boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            int y = grid[i].length - i - 1;
            if (grid[i][i] == 0 || grid[i][y] == 0) {
                return false;
            }
            for (int j = 0; j < grid[i].length; j++) {
                if (j != i && j != y) {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] target = new int[4][];
        target[0] = new int[]{2, 0, 0, 1};
        target[1] = new int[]{0, 3, 1, 0};
        target[2] = new int[]{0, 5, 2, 0};
        target[3] = new int[]{4, 0, 0, 2};
        System.out.println(new No2319().checkXMatrix(target));
    }
}
