public class singleNumber {
    public int singleNumber(int[] nums){
        int result = 0;
        for(int i = 0;i < nums.length;i++){
            int target = nums[i];
            for(int j = i+1 ;j < nums.length ;j++){
                if(target == nums[j]){
                    break;
                }
                result = j;
            }
            if(result == nums.length){
                return i;
            }
        }
        return 0;
    }


    public static void main(String[] args){
        int[] nums = {2,2,1};
        new singleNumber().singleNumber(nums);
    }
}
