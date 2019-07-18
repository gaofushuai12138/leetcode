package LinkedList;

public class DeleteRepeatNum {

    public int getLengthOfList(ListNode listNode){
        int num = 0;
        while (listNode != null){
            listNode = listNode.next;
            num++;
        }
        return num;
    }

    public ListNode deleteDuplicates(ListNode head){
        if(head == null){
            return null;
        }
        ListNode pHead = head;
        ListNode preNode;
        for(int i = 0;i < getLengthOfList(head);i++){
            if(pHead.val == head.val){

            }
            pHead = pHead.next;
        }
        return head;
    }

    public static void main(String args[]){
        DeleteRepeatNum deleteRepeatNum = new DeleteRepeatNum();
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        node.next = node1;
        node1.next = node2;
        System.out.println(deleteRepeatNum.getLengthOfList(node));
    }
}
