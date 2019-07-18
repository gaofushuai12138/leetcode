package other;

public class Reserve {
    public int reverse(int x){
        int revnum = 0;
        try {
            if(x>0){
                String num = String.valueOf(x);
                StringBuffer stringBuffer = new StringBuffer();
                for(int i = num.length()-1;i>=0;i--){
                    stringBuffer.append(num.charAt(i));
                }
                int result = Integer.parseInt(stringBuffer.toString());
                revnum = result;
            }else {
                String num = String.valueOf(x).substring(1);
                StringBuffer stringBuffer = new StringBuffer();
                for(int i = num.length()-1;i>=0;i--){
                    stringBuffer.append(num.charAt(i));
                }
                int result = 0;
                result = Integer.parseInt(stringBuffer.toString());
                revnum = result*-1;
            }
        }catch (Exception e){
            revnum = 0;
        }
        return revnum;
    }

    public static void main(String []args){
         int n =  new Reserve().reverse(-2147483648);
         System.out.println(n);
    }
}
