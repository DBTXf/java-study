package algorithm.leetcode.list._055;
/*
 *@author xufan
 *@create 2020/4/17
 */


public class Solution {

    public static boolean canJump(int[] nums) {
        boolean isCan =false;
        int nlength = nums.length;
        int[] nums_temp = new int[nlength];
        nums_temp[0] =1;
        for (int i = 0; i <nums.length ; i++) {
            int temp = nums[i];
            //判断是否能到达
            if (nums_temp[i]==1 && temp>0){
                while (temp!=0){
                    if((temp+i)<nlength){
                        nums_temp[temp+i] =1;
                    }
                    temp--;
                }
            }
        }
        if (nums_temp[nlength-1]==1){
            isCan =true;
        }
        return isCan;
    }

    public static void main(String[] args) {
        int[]  a ={2,3,1,1,4};
         System.out.println(canJump(a ));
    }
}
