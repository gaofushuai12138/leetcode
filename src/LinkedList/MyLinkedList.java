package LinkedList;

/***
 *
 */
public class MyLinkedList {

    private static class ListNode{
        private int val;
        private ListNode next;
        public ListNode(int x){
            val = x;
        }
    }
    private ListNode node;

    public ListNode getNode() {
        return node;
    }

    public MyLinkedList(){
        node = new ListNode(0);
    }

    public int getLength(){
        int sum = 0;
        ListNode p = getNode().next;
        while (p!=null){
            p = p.next;
            sum = sum + 1;
        }
        return sum;
    }

    public int get(int index){
        if(index > getLength() - 1){
            return -1;
        }
        ListNode phead = getNode();
        ListNode plink = phead.next;
        for(int i = 0;i < index ;i++)
            plink = plink.next;
        return plink.val;
    }

    public void addAtIndex(int index,int val){
        if(index <= getLength()){
            ListNode phead = getNode();
            ListNode p = phead;
            ListNode listNode = new ListNode(val);
            for(int i = 0;i < index;i++ ){
                p = p.next;
            }
            listNode.next = p.next;
            p.next = listNode;
        }
    }

    public void deleteAtIndex(int index) {
        if(index <  getLength()){
            ListNode phead = getNode();
            ListNode pdelete;
            ListNode p = phead;
            for(int i = 0;i < index;i++){
                p = p.next;
            }
            pdelete = p.next;
            p.next = pdelete.next;
            pdelete.next = null;
        }

    }

    private static void TraverseList(ListNode head){
        ListNode p = head;
        while (p != null){
            System.out.print(p.val+" ");
            p = p.next;
        }
        System.out.println();
    }

    public void addAtHead(int val){
        ListNode pbefore = getNode();
        ListNode pbehind = pbefore.next;
        ListNode listNode = new ListNode(val);
        pbefore.next = listNode;
        listNode.next = pbehind;
    }

    public void addAtTail(int val){
        ListNode nval = new ListNode(val);
        ListNode p = getNode();
        while (p.next != null){
            p = p.next;
        }
        p.next = nval;
    }

    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtHead(1);
//        myLinkedList.addAtHead(2);
        TraverseList(myLinkedList.getNode().next);
        System.out.println(myLinkedList.get(1));
        myLinkedList.addAtIndex(1,5);
        System.out.println(myLinkedList.get(1));
        TraverseList(myLinkedList.getNode().next);
        myLinkedList.deleteAtIndex(1);
        TraverseList(myLinkedList.getNode().next);
        System.out.println(myLinkedList.getLength());
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        myLinkedList.addAtIndex(3,4);
        TraverseList(myLinkedList.getNode().next);
        myLinkedList.deleteAtIndex(4);
        TraverseList(myLinkedList.getNode().next);

    }
}
