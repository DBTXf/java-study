package algorithm.leetcode;
/*
 *Created by XuFan
 *on 2020/4/5
 */


public class ArrayUtil {
    public static int[][] getRandomTable(int xlength, int ylength) {
        int[][] table = new int[xlength][ylength];
        for (int i = 0; i < xlength; i++) {
            for (int j = 0; j < ylength; j++) {
                table[i][j] = Math.random() > 0.5 ? 1 : 0;
            }
        }
        return table;
    }
    public static void show(int[][]  table){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]+",");
            }
            System.out.println();
        }
    }
}
