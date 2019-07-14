package LinkedList;

public class rotateRight {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode rotateRight(ListNode head,int k){
        if(k<0 || head == null)
            return null;
        if( k == 0){
            return head;
        }
        ListNode listNode = head;
        int len = getLength(head);
        int n = k % len;   //  获取向右走的步数
        if(n == 0){
            return head;
        }
        ListNode p;
        ListNode phead,ptail;
        p = head;
        for(int i = 0;i < getLength(head)-n-1;i++){
            p = p.next;
        }
        phead = p.next;
        ptail = phead;
        while (ptail.next != null){
            ptail = ptail.next;
        }
        p.next = null;
        ptail.next = head;
        return phead;
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

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);


        node1.next = node2;

        ListNode list = new rotateRight().rotateRight(node1,1);
        ListNode p = list;
        while (p!=null){
            System.out.print(p.val+ " ");
            p = p.next;
        }

    }
}
