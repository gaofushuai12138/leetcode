package LinkedList;

public class middleNode {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val =x;
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


    public ListNode middleNode(ListNode head){
        int len = getLength(head);
        int n = len/2;
        ListNode p = head;
        for(int i = 0;i < n;i++){
            p = p.next;
        }
        return p;
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


        ListNode listNode = new middleNode().middleNode(node1);
        System.out.println(listNode.val);

    }
}
