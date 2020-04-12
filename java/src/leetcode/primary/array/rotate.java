package leetcode.primary.array;
/*
 *Created by XuFan
 *on 2020/4/12
 */


public class rotate {
    public void rotate_1(int[] nums, int k) {
        int max = nums.length;
        int k_min = k%max;
        reverse(nums, 0, max - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k_min, max - 1);

    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

    }
}
