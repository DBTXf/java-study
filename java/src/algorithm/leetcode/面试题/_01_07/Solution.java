package algorithm.leetcode.面试题._13._01_07;
/*
 *Created by XuFan
 *on 2020/4/7
 */


import algorithm.leetcode.ArrayUtil;

public class Solution {
    public  static  void rotate(int[][] matrix) {
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
        int[][]  array = ArrayUtil.getRandomTable(3,3);
        ArrayUtil.show(array);
        rotate(array);
        System.out.println("-----------");
        ArrayUtil.show(array);
    }
}
