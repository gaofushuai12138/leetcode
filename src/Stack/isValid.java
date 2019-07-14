package Stack;

import java.util.Stack;

public class isValid {
    public boolean isValid(String s){

        if(s.equals("")){
            return true;
        }
        Stack<Character> isUp = new Stack<>();
        try{
        int  i =0;
        int count = 0;
        for(i = 0;i<s.length();i++){
            if(s.charAt(i) =='(' || s.charAt(i) == '[' || s.charAt(i) =='{'){
                isUp.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                count++;
                if(isUp.peek() == '('){
                    isUp.pop();
                }else {
                    return false;
                }
            }

            if(s.charAt(i) == ']'){
                count++;
                if(isUp.peek() =='['){
                    isUp.pop();
                }else {
                    return false;
                }
            }
            if(s.charAt(i) == '}'){
                count++;
                if(isUp.peek() == '{'){
                    isUp.pop();
                }else {
                    return false;
                }
            }
        }




        if(i == s.length()&&count>0&&isUp.empty()){
            return true;
        }
        }catch (Exception e){
            return false;
        }
        return false;
    }
    public static void main(String[] args){
        String s = "([]";
        System.out.println(new isValid().isValid(s));

    }
}
