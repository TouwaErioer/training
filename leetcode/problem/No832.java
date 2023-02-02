package leetcode.problem;


/**
 * @Description https://leetcode.cn/problems/flipping-an-image/
 * @Author duhongyu
 * @Data 2022/7/22 18:01
 **/
public class No832 {

    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                int temp = image[i][j];
                int point = image[i].length - 1 - j;
                image[i][j] = image[i][point];
                image[i][point] = temp;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = new No832().flipAndInvertImage(array);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
