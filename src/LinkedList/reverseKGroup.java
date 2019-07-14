package LinkedList;

import java.util.ArrayList;

public class reverseKGroup {

    /***
     *  链表节点
     */
    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    /***
     * 求链表长度
     * @param head
     * @return
     */
    public static int getLength(ListNode head){
        int n = 0;
        ListNode l = head;
        while (l!=null){
            n++;
            l = l.next;
        }
        return n;
    }

    /***
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p = head;
        int num[] = new int[getLength(head)];
        for(int i = 0;i<getLength(head);i++){
            num[i] = p.val;
            p = p.next;
        }

        ArrayList numList = new ArrayList();
        int count = num.length / k;
        int rest = num.length % k;
        for(int i = 0 ;i < count; i++){
            for(int j = (i+1)*k-1;j>=i*k;j--){
                numList.add(num[j]);
            }
        }

        for(int i = num.length-rest;i<num.length;i++){
            numList.add(num[i]);
        }
        ListNode newList = new ListNode(0);
        ListNode pNew = newList;
        for(int i = 0;i < numList.size();i++ ){
            ListNode NewNode = new ListNode((Integer) numList.get(i));
            pNew.next = NewNode;
            pNew = NewNode;
        }
        pNew.next = null;
        return newList.next;
    }


    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode listNode = new reverseKGroup().reverseKGroup(node1,3);
        ListNode p = listNode;
        while (p!=null){
            System.out.print(p.val+"   ");
            p = p.next;
        }

    }

}
