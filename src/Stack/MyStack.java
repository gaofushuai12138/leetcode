package Stack;

import java.util.LinkedList;

public class MyStack {

    private LinkedList queue;

    public MyStack(){
        queue = new LinkedList();
    }

    public void push(int x){
        queue.add(x);
    }

    public int pop(){
        return (int) queue.removeLast();
    }

    public int top(){
        return (int) queue.getLast();
    }

    public boolean empty(){
       return queue.isEmpty();
    }


    public static void main(String[] args){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        myStack.pop();
        System.out.println(myStack.top());
    }

}
