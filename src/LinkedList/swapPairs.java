package LinkedList;

public class swapPairs {


    public static void main(String[] args){

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
}
