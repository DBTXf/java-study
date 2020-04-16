package algorithm.leetcode.list._445;
/*
 *@author xufan
 *@create 2020/4/14
 */


import algorithm.leetcode.utils.ListNode;

import java.util.Stack;

public class Solution_1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 把两个链表的值压到栈里面
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        // 开始 从栈里面 取出 数字计算
        // 边界 条件 两栈 为空  最高位进位
        int carry = 0;  // 进位
        ListNode head = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
            int sum = carry;
            sum += stack1.isEmpty()? 0: stack1.pop();
            sum += stack2.isEmpty()? 0: stack2.pop();
            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
            carry = sum / 10;
        }
        return head;
    }
}
