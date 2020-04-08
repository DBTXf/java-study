package leetcode.面试题._13;
/*
 *Created by XuFan
 *on 2020/4/8
 */


public class Solution {
    public   static  int getNumSum(int num ){
        int sum =0 ;
        while(num>0){
            int temp = num%10;
            sum+=temp;
            num =num/10;
        }
        return sum;
    }
    public   static  boolean getIsMove(int i,int j, int[][] array){
        boolean isMove =false;
        if (i ==0 && j ==0){
            isMove =true;
        }
        if(i==0 && j>0 ){
            if(array[i][j-1] ==1){
                isMove =true;
            }
        }else if(j==0&& i>0 ){
            if(array[i-1][j] ==1){
                isMove =true;
            }
        }else if (i>0 && j>0){
            if(array[i-1][j] ==1 || array[i][j-1] ==1){
                isMove =true;
            }
        }
        return isMove;
    }
    public static int movingCount(int m, int n, int k) {
        int Count =0;
        int[][] movingArray =new int[m][n] ;
        for (int i = 0; i <m ; i++) {

            for (int j = 0; j <n ; j++) {
                System.out.println("---------------");
                System.out.println("坐标i:"+i+"，坐标j:"+j);
                System.out.println("i值:"+getNumSum(i)+"，j值:"+getNumSum(j));

                if((getNumSum(i)+getNumSum(j))<=k && getIsMove(i,j,movingArray)){
                    Count++;
                    movingArray[i][j] =1 ;
                }
                System.out.println("Count值:"+Count);
            }
        }

        return Count;
    }

    public static void main(String[] args) {
        System.out.println(movingCount(38,15,9));
    }
}
