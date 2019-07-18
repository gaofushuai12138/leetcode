package other;

/***
 * 有问题
 */
public class plusOne {
    public int[]plusOne(int[] digits){
        int sum = 0;
        for(int i = 0 ;i<digits.length;i++){
            sum = sum*10+digits[i];
        }
        sum = sum + 1;
        System.out.println(sum);
        String num = String.valueOf(sum);
        int newNum[] = new int[num.length()];
        for (int i = 0 ;i<num.length();i++){
            newNum[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return newNum;
    }

    public static void main(String[] args){
        int num[] = {
                9,8,7,6,5,4,3,2,1,0};
        int newnums[] = new plusOne().plusOne(num);
        for(int i = 0 ;i < newnums.length;i++){
            System.out.print(newnums[i]+" ");
        }
    }
}
