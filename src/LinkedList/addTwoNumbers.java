package LinkedList;

public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode listNode = new ListNode(0);
        ListNode p;
        p = listNode;
        addTwoNumbers sum = new addTwoNumbers();
        int addnum1 = sum.travse(l1);
        int addnum2 = sum.travse(l2);
        System.out.println(addnum1+addnum2);
        int result = addnum1 + addnum2;
        int num = 0;
        int i = 0;
        do{
            num = result % 10;
            ListNode listNode1 = new ListNode(num);
            p.next = listNode1;
            p = listNode1;
            result = result /10;
        }while(result % 10 != 0 || result>0);
        return listNode.next;
    }
    public int travse(ListNode listNode){
        ListNode listnode;
        listnode = listNode;
        int sum[] = new int[100];
        int i = 0;
        int result = 0;
        while (listnode!=null){
            sum[i] = listnode.getVal();
            i++;
            listnode = listnode.next;
        }
        for(int point = i-1;point>=0;point--){
            result = result*10 + sum[point];
        }
        return result;
    }

    public static void main(String[] args){
        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(6);
        ListNode listNode5 = new ListNode(4);
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        addTwoNumbers sum = new addTwoNumbers();
//        System.out.println(sum.travse(listNode));
        ListNode listNode6 = sum.addTwoNumbers(listNode,listNode3);
        while (listNode6!=null){
            System.out.print(listNode6.getVal()+"");
            listNode6 = listNode6.next;

        }

//        sum.travse(listNode);

    }

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        public int getVal() {
            return val;
        }
    }
}
