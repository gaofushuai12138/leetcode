package other;

/***
 * 存在问题
 */

public class maxProfit {

    public static int[] getMaxAndIndex(int[] prices){
        int result[] =new int[2];
        int max = 0;
        int pos = 0;
        for(int i = 0;i < prices.length;i++){
            if(prices[i]>max){
                max = prices[i];
                pos = i;
            }
        }
        result[0] = max;
        result[1] = pos;
        return result;

    }

    public static int[] getMinAndIndex(int[] prices){
        int result[] =new int[2];
        int min = 999999;
        int pos = 0;
        for(int i = 0;i < prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
                pos = i;
            }
        }
        result[0] = min;
        result[1] = pos;
        return result;
    }

    public int maxProfit(int[] prices){
        int minresult[] = getMinAndIndex(prices);
        int maxresult[] =getMaxAndIndex(prices);

        if(maxresult[1]<=minresult[1]){
            return 0;
        }else{
            return maxresult[0]-minresult[0];
        }
    }

    public static void main(String[] args){

        int prices[] = {7,1,5,3,6,4};
        System.out.println(new maxProfit().maxProfit(prices));


    }
}
