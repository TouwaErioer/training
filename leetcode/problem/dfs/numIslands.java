package leetcode.problem.dfs;

/**
 * @Description https://leetcode-cn.com/problems/number-of-islands/submissions/ - 岛屿数量 时间复杂度：O(MN)
 * @Author dohongyu
 * @Data 2021/9/29 13:36
 **/
public class numIslands {
    public int solve(char[][] island) {
        // 前置判断
        if (island == null || island[0].length == 0)
            return 0;
        int res = 0;
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                if (island[i][j] == '1') {
                    res += 1;
                    dfs(island, i, j);
                }
            }
        }
        return res;
    }

    public void dfs(char[][] island, int i, int j) {
        // 边界判断 or 是否为岛屿判断
        if (i < 0 || i == island.length || j < 0 || j == island[i].length || island[i][j] != '1') {
            return;
        }
        // 走过的设置为0
        island[i][j] = '0';
        dfs(island, i + 1, j);
        dfs(island, i - 1, j);
        dfs(island, i, j + 1);
        dfs(island, i, j - 1);
    }
}
