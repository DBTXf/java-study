package algorithm.leetcode.primary.array;
/*
 *Created by XuFan
 *on 2020/4/12
 */


import java.util.Arrays;

public class singleNumber {
    public static int singleNumber_1(int[] nums) {
        Arrays.sort(nums);
        int temp =0;
        int tempNum =0;
        for (int i = 0; i < nums.length; i++) {
            if(temp!=nums[i]){
                if(tempNum==1){
                    return  temp;
                }
                tempNum =0;
                temp =nums[i] ;
                tempNum++;
            }else{
                tempNum++;
            }
            if(i==nums.length-1){
               return  nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
