package algorithm.leetcode.list._151;
/*
 *Created by XuFan
 *on 2020/4/10
 */


class Solution {
    public static String reverseWords(String s) {
        String [] arr = s.trim().split("\\s+");
        StringBuilder stringBuilder =new StringBuilder();
        for (int i = arr.length-1; 0<=i ; i--) {

                if (i==0){
                    stringBuilder.append(arr[i]);
                }else {
                    stringBuilder.append(arr[i]).append(" ");
                }


        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords(" hello          world!          ")+"'");
    }
}