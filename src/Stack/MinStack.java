package Stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    public MinStack(){
        stack = new Stack();
    }

    public void push(int x){
        stack.push(x);
    }


    public void pop(){
        stack.pop();
    }


    public int top(){
        return (int) stack.peek();
    }


    public int getMin(){
        int min = Integer.MAX_VALUE;
        int m = 0;
        for(Integer x : stack){
            if(x<min)
                min = x;
        }
        return min;
    }


}
