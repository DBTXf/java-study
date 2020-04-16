package algorithm.leetcode.primary.array;
/*
 *Created by XuFan
 *on 2020/4/12
 */


import java.util.Arrays;

public class containsDuplicate {
    public static boolean containsDuplicate_1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {

    }
}
