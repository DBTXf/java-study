package algorithm.leetcode.list._445;
/*
 *@author xufan
 *@create 2020/4/14
 */

import algorithm.leetcode.utils.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return new ListNode(2);
    }
    public static void  setList(ListNode listNode, int nums){
            int num = nums%10;
            ListNode listNode1 =new ListNode(0);
            listNode.val =num;
            int temp_num = nums/10;
            if(temp_num>0){
                listNode.next = listNode1;
                setList( listNode1 , temp_num);
            }else{
                listNode.next =null;
            }

    }
    public  static ListNode   reverseList(ListNode listNode){
        if(listNode.next == null)  {
            return listNode;
        }
        ListNode temp1,temp2,temp3=null ; // temp1 当前节点 temp2 下个节点 temp3 上个节点
        temp1 =listNode;
        while(temp1.next!=null){
            System.out.print(temp1.val +" ");
            temp2=temp1.next;
            temp1.next =temp3;
            temp3 = temp1;
            temp1 =temp2;
        }
        temp1.next =temp3;
        return temp1;
    }
    public static void main(String[] args) {
        int a = 3427;
        ListNode temp =new ListNode(0);
        setList(temp,a);
        ListNode nodes = temp;
        while(nodes!=null){

            System.out.print(nodes.val +" ");
            nodes = nodes.next;
        }
        System.out.println("----------------------------");
        ListNode node  =reverseList(temp);
//        System.out.println("----------------------------");
//        while(node!=null){
//            System.out.print(node.val +" ");
//            node = node.next;
//        }
        while(node!=null){
            System.out.print(node.val +" ");
            node = node.next;
        }


    }
}
