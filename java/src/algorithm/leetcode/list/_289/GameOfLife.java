package algorithm.leetcode.list._289;
/*
 *Created by XuFan
 *on 2020/4/5
 */


import static algorithm.leetcode.ArrayUtil.*;

public class GameOfLife {
    public static void gameOfLife_1(int[][] board) {
        int nSum =0;
        int [][] boardTemp = new int[board.length+2][board[0].length+2];
        for (int i = 0; i < boardTemp.length - 2; i++) {
            for (int j = 0; j < boardTemp[0].length - 2; j++) {
                boardTemp[i + 1][j + 1] = board[i][j];
            }
        }
        for (int i = 0; i < boardTemp.length-2; i++) {
            for (int j = 0; j <boardTemp[0].length-2 ; j++) {
                nSum += boardTemp[i][j] + boardTemp[i][j + 1] + boardTemp[i][j + 2] + boardTemp[i + 1][j]
                        + boardTemp[i + 1][j + 2] + boardTemp[i + 2][j] + boardTemp[i + 2][j + 1] + boardTemp[i + 2][j + 2];
                if ((nSum ==2  && boardTemp[i+1][j+1] ==1 )||(nSum ==3  )){
                    board[i][j] =1;
                }else{
                    board[i][j] =0;
                }
                nSum = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][]  table =  getRandomTable(10 ,10);
        System.out.println("--------开始--------");
        show(table);
//        while(true){
        System.out.println("--------完成--------");
        gameOfLife_1(table);
        show(table);
//        }



    }
}
