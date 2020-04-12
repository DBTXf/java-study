package leetcode.primary.array;
/*
 *Created by XuFan
 *on 2020/4/12
 */


import leetcode.ArrayUtil;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int max = matrix.length;
        for (int i = 0; i <max ; i++) {
            for (int j = i; j < max; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
            for (int j = 0; j < max / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][max - j - 1];
                matrix[i][max - j - 1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = ArrayUtil.getRandomTable(4,4);
        ArrayUtil.show(array);
        rotate(array);
        ArrayUtil.show(array);
    }
}

