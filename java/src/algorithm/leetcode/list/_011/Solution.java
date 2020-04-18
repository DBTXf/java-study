package algorithm.leetcode.list._011;
/*
 *@author xufan
 *@create 2020/4/18
 */


public class Solution {
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int height_max =Math.min(height[i],height[j]);
                int area = height_max*(j-i);
                if(area>max){
                    max =area;
                }
            }
        }
        return  max;
    }

    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }
}
