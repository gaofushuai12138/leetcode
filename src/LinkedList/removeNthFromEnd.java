package LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}


public class removeNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head,int n){

        if(n==removeNthFromEnd.getLength(head) && n==1){
            return null;
        }

        if(n == removeNthFromEnd.getLength(head)){
            head = head.next;
            return head;
        }
        ListNode lastNode = head;
        int length = removeNthFromEnd.getLength(head);
        int step = length - n;
        System.out.println("step:"+step);
        for(int i = 1;i<step;i++){
            lastNode = lastNode.next;
        }
        System.out.println("val:"+lastNode.val);
        lastNode.next = lastNode.next.next;
        ListNode p = lastNode.next;
        p = null;
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

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        node1.next = node2;


        new removeNthFromEnd().removeNthFromEnd(node1,2);
        System.out.println(getLength(node1));
    }
}

