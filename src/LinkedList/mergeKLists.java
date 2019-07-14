package LinkedList;

import com.sun.corba.se.spi.transport.ReadTimeouts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class mergeKLists {

    private static ListNode mergeKLists(ListNode[] list){
        if(list.length == 0){
            return null;
        }
        ListNode head = null;
        List sum =new ArrayList();
        for(int i = 0;i<list.length;i++){
            ListNode p = list[i];
            for(int j =0;j<getLength(list[i])&&getLength(list[i])>0;j++){
                sum.add(p.val);
                p = p.next;
            }
        }
        Collections.sort(sum, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return 1;
                }else if(o1<o2) {
                    return -1;
                }else return 0;
            }
        });
        if(sum.size() == 0){
            return null;
        }
        head = new ListNode((Integer) sum.get(0));
        ListNode p = head;
        for(int i = 1;i<sum.size();i++){
            ListNode newnode = new ListNode((Integer) sum.get(i));
            p.next = newnode;
            p = newnode;
        }
        p.next = null;

        return head;
    }

    public static int getLength(ListNode head){
        int n = 0;
        ListNode l = head;
        while (l!=null){
            n++;
            l = l.next;
        }
        return n;
    }


    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public static void main(String[] args){
       ListNode node1 = new ListNode(1);
       ListNode node1_1 = new ListNode(2);
       ListNode node1_2 = new ListNode(3);
       node1.next = node1_1;
       node1_1.next = node1_2;

       ListNode node2 = new ListNode(2);
       ListNode node2_1 = new ListNode(5);
       node2.next = node2_1;

       ListNode[] listNodes = {node1,node2};
       mergeKLists(listNodes);
    }
}

