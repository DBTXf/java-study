package algorithm.leetcode.list._876;
/*
 *@author xufan
 *@create 2020/4/17
 */


import algorithm.leetcode.utils.ListNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow ;
    }
}
