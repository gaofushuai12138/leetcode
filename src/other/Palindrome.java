package other;

public class Palindrome {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = num.length()-1;i>=0;i--){
            stringBuffer.append(num.charAt(i)+"");
        }
        String newnum = stringBuffer.toString();
        if(newnum.equals(num))
        return true;
        return false;
    }

    public static void main(String []args){
       System.out.println(new Palindrome().isPalindrome(-121));

    }
}
