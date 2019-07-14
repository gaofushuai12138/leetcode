package LinkedList;

import java.util.Arrays;

public class sortList {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    private int getLength(ListNode head){
        ListNode p = head;
        int len = 0;
        while (p != null){
            p = p.next;
            len = len + 1;
        }
        return len;
    }


    public ListNode sortList(ListNode head){
        ListNode p = head;
        if (getLength(head) > 0){
            int nums[] = new int[getLength(head)];
            for(int i = 0;i < nums.length;i++){
                nums[i] = p.val;
                p = p.next;
            }
            Arrays.sort(nums);
            ListNode phead = new ListNode(nums[0]);
            ListNode pNew = phead;
            for(int i = 1;i < nums.length;i++){
                ListNode pblock = new ListNode(nums[i]);
                pNew.next = pblock;
                pNew = pblock;
            }
            return phead;
        }
        return null;

    }

    public static void main(String[] args){
        sortList sortList = new sortList();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(-1);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        sortList.sortList(node1);
    }
}
